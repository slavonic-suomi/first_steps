package com.company.reflection;


import java.lang.annotation.*;

@Target(value = {
        ElementType.METHOD
})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Profiling {
}
