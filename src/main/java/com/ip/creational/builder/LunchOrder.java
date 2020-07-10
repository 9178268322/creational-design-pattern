package com.ip.creational.builder;

/**
 * This class has builder inner
 * class to build the order.
 */
public class LunchOrder {

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    /**
     * This is an inner static class.
     */
    public static class Builder {
        private static String bread;
        private static String condiments;
        private static String dressing;
        private static String meat;

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder breadNeed(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condimentsNeed(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressingNeed(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meatNeed(String meat) {
            this.meat = meat;
            return this;
        }
    }

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
