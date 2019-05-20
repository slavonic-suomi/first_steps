package com.company.reflection;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonValidator {
    void validate(Object o) {
        Class<?> clz = o.getClass();

        List<Field> nnFields = Arrays.stream(clz.getDeclaredFields())
                .filter(f -> f.getAnnotation(NotNull.class) != null)
                .collect(Collectors.toList());


        nnFields.forEach(field -> {
            try {
                field.setAccessible(true);
                Object value = field.get(o);

                if (value == null) {
                    throw new IllegalArgumentException(
                        "Field " + field.getName() + " can't be null"
                    );
                }

            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException(e);
            }
        });

        List<Field> maxFields = Arrays.stream(clz.getDeclaredFields())
                .filter(f -> f.getAnnotation(Max.class) != null)
                .collect(Collectors.toList());

        maxFields.forEach(field -> {
            try {

                Max max = field.getAnnotation(Max.class);
                int annotationValue = max.maxValue();

                field.setAccessible(true);

                Object value = field.get(o);
                Class<?> type = field.getType();
                if (!int.class.equals(type) && !Integer.class.equals(type)) {
                    throw new IllegalArgumentException(
                        "Wrong annotation usage"
                    );
                }

                Integer intValue = (Integer) value;
                if (intValue > annotationValue) {
                    throw new IllegalArgumentException(
                            "Field " + field.getName() + " can't be greater than " + annotationValue
                    );
                }

            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException(e);
            }
        });
    }
}
