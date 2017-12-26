package com.learn.eurekaserver;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author sunli
 * @create 2017-12-18 17:24
 */

public class ParameterNames {
    public static void main(String[] args) throws NoSuchMethodException {
        Method method = ParameterNames.class.getMethod("main", String[].class);
        for (final Parameter parameter : method.getParameters()) {
            System.out.println("Parameter:" + parameter.getName());
        }
    }
}
