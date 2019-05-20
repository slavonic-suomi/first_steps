package com.company.reflection;

//@NotNull
public class User implements IUser {

    @NotNull
    private String name;

    @Max(maxValue = 150)
    public int age;

    @Max(maxValue = 100)
    @Min(23)
    private int children;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    @Profiling
    public int getAge() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getChildren() {
        return children;
    }

    @Override
    public void setChildren(int children) {
        this.children = children;
    }
}
