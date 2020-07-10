package com.ip.creational.singleton;

import org.testng.annotations.Test;

/**
 * This test class is used to test
 * eager loading instance.
 */
public class DbSingletonDemoTest {

    @Test
    public void dbSingletonDemoTest() {
        DbSingleton singleton = DbSingleton.getInstance();
        System.out.println(singleton);

        DbSingleton singleton1 = DbSingleton.getInstance();
        System.out.println(singleton1);
    }
}
