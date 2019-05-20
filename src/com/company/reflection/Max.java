package com.company.reflection;

import java.lang.annotation.*;

@Target(value = {
        ElementType.FIELD,
        ElementType.PARAMETER
})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Max {
    int maxValue();
}
