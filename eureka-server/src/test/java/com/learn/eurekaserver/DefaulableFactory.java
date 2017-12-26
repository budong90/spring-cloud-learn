package com.learn.eurekaserver;

import java.util.function.Supplier;

/**
 * @author sunli
 * @create 2017-12-18 16:01
 */

public class DefaulableFactory {

    static Defaulable create(Supplier<Defaulable> supplier) {
        return supplier.get();
    }
}
