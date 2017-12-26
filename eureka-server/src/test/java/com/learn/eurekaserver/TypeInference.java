package com.learn.eurekaserver;

/**
 * @author sunli
 * @create 2017-12-18 17:09
 */

public class TypeInference {
    public static void main(String[] args) {
        final Value<String> value = new Value<>();
        value.getOrDefault("22", Value.<String>defaultValue());
    }
}
