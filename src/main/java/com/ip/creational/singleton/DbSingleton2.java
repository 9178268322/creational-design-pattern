package com.ip.creational.singleton;

/**
 * This is thread safe single ton class.
 */
public final class DbSingleton2 {

    private static volatile DbSingleton2 instance;

    private DbSingleton2() {
        if (instance != null) {
            throw new IllegalArgumentException("Use getInstance() method to create");
        }
    }

    public static DbSingleton2 getInstance() {
        if (instance == null) {
            synchronized (DbSingleton2.class) {
                if (instance == null) {
                    instance = new DbSingleton2();
                }
            }
        }
        return instance;
    }
}
