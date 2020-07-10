package com.ip.creational.singleton;

import org.testng.annotations.Test;

/**
 * This test class is used to test
 * mysql db instances.
 */
public class DbSingletonDerbyDemoTest {

    @Test
    public void singletonDerbyTest() {
        DbSingletonDerby instance = DbSingletonDerby.getInstance();

        long timeBefore = 0;
        long timeAfter = 0;

        System.out.println(instance);

        timeBefore = System.currentTimeMillis();
        instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

        timeBefore = System.currentTimeMillis();
        instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);
    }
}
