package com.ip.creational.singleton;

import org.testng.annotations.Test;

/**
 * This test class is used to
 * test thread safe db instance.
 */
public class DbSingletonDemo2Test {

    @Test
    public void dbSingletonDemo2Test() {
        DbSingleton2 dbSingleton = DbSingleton2.getInstance();
        System.out.println(dbSingleton);

        DbSingleton2 dbSingleto = DbSingleton2.getInstance();
        System.out.println(dbSingleto);
    }
}
