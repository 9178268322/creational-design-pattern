package com.ip.creational.factory;

import org.testng.annotations.Test;

/**
 * This test class is used
 * to test factory design pattern.
 */
public class FactoryDemoTest {

    @Test
    public void factoryDemoTest() {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(site.getPages());
    }
}
