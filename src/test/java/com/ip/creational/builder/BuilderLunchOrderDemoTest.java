package com.ip.creational.builder;

import org.testng.annotations.Test;

/**
 * This test class is testing builder
 * lunchorder class.
 */
public class BuilderLunchOrderDemoTest {

    @Test
    public void builderLunchOrderTest() {
        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.breadNeed("Wheat").condimentsNeed("Lettuce").dressingNeed("Mayo").meatNeed("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
