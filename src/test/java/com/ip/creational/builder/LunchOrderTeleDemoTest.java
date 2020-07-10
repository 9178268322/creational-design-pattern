package com.ip.creational.builder;

import org.testng.annotations.Test;

/**
 * This test class is used to test
 * telescope constructor.
 */
public class LunchOrderTeleDemoTest {

    @Test
    public void lunchOrderTeleTest() {
        LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");

        // lunchOrderTele.setBread("Wheat");
        // lunchOrderTele.setCondiments("Lettuce");
        // lunchOrderTele.setDressing("Mustard");
        // lunchOrderTele.setMeat("Ham");

        System.out.println(lunchOrderTele.getBread());
        System.out.println(lunchOrderTele.getCondiments());
        System.out.println(lunchOrderTele.getDressing());
        System.out.println(lunchOrderTele.getMeat());
    }
}
