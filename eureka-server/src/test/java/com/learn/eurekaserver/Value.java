package com.learn.eurekaserver;

/**
 * @author sunli
 * @create 2017-12-18 17:09
 */

public class Value<T> {
    public static <T> T defaultValue() {
        return null;
    }

    public T getOrDefault(T value, T defaultValue) {
        return (value != null) ? value : defaultValue;
    }
}
