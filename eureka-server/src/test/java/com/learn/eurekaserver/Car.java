package com.learn.eurekaserver;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author sunli
 * @create 2017-12-18 16:19
 */

public class Car {
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }

    public static void main(String[] args) {
        // 1.构造方法引用 Class::new
        final Car car = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car);
        // 2.静态方法引用 Class::static_method
        cars.forEach(Car::collide);
        // 3.类成员方法引用 Class::method
        cars.forEach(Car::repair);
        final Car police = Car.create(Car::new);
        // 4.实例成员方法引用 instance::method
        cars.forEach(police::follow);
    }
}
