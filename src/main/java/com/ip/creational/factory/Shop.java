package com.ip.creational.factory;

/**
 * This shop class is creating website
 * for itself.
 */
public class Shop extends Website {

    @Override
    protected void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
