package com.company.reflection;

public class UserValidator {
    void validate(IUser IUser) {
        if (IUser.getName() == null) {
            throw new IllegalArgumentException();
        }
    }
}
