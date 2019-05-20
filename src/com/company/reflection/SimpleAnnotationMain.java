package com.company.reflection;

public class SimpleAnnotationMain {
    public static void main(String[] args) {
        UserFactory factory = new UserFactory();
        CommonValidator validator = new CommonValidator();

        IUser user = factory.createStub();
//        user.setName(null);
//        user.setAge(200);
//        validator.validate(user);

        System.out.println(user.getAge());
    }
}
