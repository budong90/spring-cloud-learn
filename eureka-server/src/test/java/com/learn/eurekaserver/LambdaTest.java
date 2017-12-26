package com.learn.eurekaserver;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author sunli
 * @create 2017-12-18 15:25
 */

public class LambdaTest {

    @Test
    public void test() {
        Arrays.asList("a", "b", "c").forEach(e -> System.out.println(e));
        Arrays.asList("a", "b", "c").forEach((String e) -> System.out.println(e));
        Arrays.asList("a", "b", "c").forEach(e -> {
            System.out.println(e);
            System.out.println(e);
        });
    }

    @Test
    public void test2() {
//        String separator = ",";
        final String separator = ",";
        Arrays.asList("a", "b", "d").forEach(
                (String e) -> System.out.print(e + separator));
    }

    @Test
    public void test3() {
        List<String> list = Arrays.asList("a", "d", "b");
        list.sort((e1, e2) -> e1.compareTo(e2));
        System.out.println(list);
        List<String> list2 = Arrays.asList("a", "d", "b");
        list2.sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            return result;
        });
        System.out.println(list2);
    }

    @Test
    public void test4() {
        Defaulable defaulable = DefaulableFactory.create(DefaulableImpl::new);
        System.out.println(defaulable.notRequired());
        defaulable = DefaulableFactory.create(OverridableImpl::new);
        System.out.println(defaulable.notRequired());
    }
}
