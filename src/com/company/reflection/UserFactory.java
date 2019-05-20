package com.company.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserFactory {

    public IUser createStub() {
        IUser user = new User();
        user.setName("test");
        user.setAge(12);

        user = (IUser) makeMagic(user);
        return user;
    }

    private Object makeMagic(Object original) {
        Method[] methods = original.getClass().getMethods();
        List<Method> profilingMethods = Arrays.stream(methods)
                .filter(m -> m.getAnnotation(Profiling.class) != null)
                .collect(Collectors.toList());

        if (profilingMethods.size() == 0) {
            return original;
        } else {
            Object proxy = Proxy.newProxyInstance(
                    original.getClass().getClassLoader(),
                    original.getClass().getInterfaces(),
                    new InvocationHandler() {
                        @Override
                        public Object invoke(
                                Object proxy,
                                Method method,
                                Object[] args) throws Throwable {

                            if (method.getAnnotation(Profiling.class) != null) {
                                long start = System.currentTimeMillis();
                                Object result = method.invoke(original, args);
                                long end = System.currentTimeMillis();
                                System.out.println(end - start);
                                return result;
                            } else {
                                return method.invoke(original, args);
                            }

                        }
                    }
            );

            return proxy;
        }
    }
}
