package com.ip.creational.singleton;

import org.testng.annotations.Test;

/**
 * This test class is used to
 * test lazy loading instance.
 */
public class DbSingletonDemo1Test {

    @Test
    public void dbSingletonDemo1Test() {
        DbSingleton1 singleton1 = DbSingleton1.getInstance();
        System.out.println(singleton1);

        DbSingleton1 dbSingleton1 = DbSingleton1.getInstance();
        System.out.println(dbSingleton1);
    }
}
