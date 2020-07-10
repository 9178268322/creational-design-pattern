package com.ip.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * This Registry class is used
 * to create the items and load the items.
 */
public class Registry {

    private static Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Basic Book");
        items.put("Book", book);
    }
}
