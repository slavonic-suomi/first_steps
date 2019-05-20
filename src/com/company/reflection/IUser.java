package com.company.reflection;

public interface IUser {
    String getName();

    void setName(String name);

    @Profiling
    int getAge();

    void setAge(int age);

    int getChildren();

    void setChildren(int children);
}
