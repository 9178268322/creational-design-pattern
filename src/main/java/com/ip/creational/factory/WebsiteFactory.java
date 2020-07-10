package com.ip.creational.factory;

/**
 * This class giving the website
 * for appropriative site.
 */
public final class WebsiteFactory {

    private WebsiteFactory() {

    }
    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
