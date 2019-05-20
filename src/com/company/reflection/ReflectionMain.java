package com.company.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<? extends IUser> clz = User.class;

//        Class<?> clz1 = Class.forName("com.company.reflection.User");

        System.out.println(clz.getCanonicalName());
//        Method[] methods = clz.getMethods();
//        Arrays.stream(methods)
//                .forEach(System.out::println);


        IUser IUser = new User();
        IUser.setName("Ivan");

//        user.getName()
        Method getter = clz.getMethod("getName");
        Object getResult = getter.invoke(IUser);

        System.out.println(getResult);

        Method setMethod =
                clz.getMethod("setName", String.class);

        Object setResult = setMethod.invoke(IUser, "John");
        System.out.println(setResult);

        System.out.println(IUser.getName());

//        clz.getConstructor()
        Field[] fields = clz.getFields();

        Arrays.stream(fields).forEach(System.out::println);

        Field nameField = clz.getDeclaredField("name");
        Field ageField = clz.getDeclaredField("age");

        nameField.setAccessible(true);
        nameField.set(IUser, "Tom");

        System.out.println(IUser.getName());


    }
}
