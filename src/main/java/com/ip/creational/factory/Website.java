package com.ip.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * This abstract class containing list of pages
 * and a createWebSite() method.
 */
public abstract class Website {

    protected static List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public Website() {
        this.createWebsite();
    }

    protected abstract void createWebsite();
}
