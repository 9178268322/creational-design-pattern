package com.ip.creational.builder;

import org.testng.annotations.Test;

/**
 * This test is used to test the
 * LunchOrderBean class.
 */
public class LunchOrderBeanDemoTest {

    @Test
    public void builderOrderBeanTest() {
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }
}
