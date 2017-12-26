package com.learn.eurekaserver;

public interface Defaulable {

    default String notRequired() {
        return "Default implementation";
    }
}
