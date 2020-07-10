package com.ip.creational.singleton;

/**
 * This is eager loading.
 */
public final class DbSingleton {

    private static DbSingleton instance = new DbSingleton();

    private DbSingleton() {}

    public static DbSingleton getInstance() {
        return instance;
    }
}
