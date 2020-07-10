package com.ip.creational.singleton;

/**
 * This is lazy loading.
 */
public final class DbSingleton1 {

    private static DbSingleton1 instance;

    private DbSingleton1() {}

    public static DbSingleton1 getInstance() {
        if (instance == null) {
            instance = new DbSingleton1();
        }
        return instance;
    }
}
