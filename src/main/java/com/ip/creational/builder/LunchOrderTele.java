package com.ip.creational.builder;

/**
 * This class has telescope constructors
 * to initialize the values.
 */
public class LunchOrderTele {

    private static String bread;
    private static String condiments;
    private static String dressing;
    private static String meat;

    public LunchOrderTele (String bread) {
        this.bread = bread;
    }

    public LunchOrderTele (String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrderTele (String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }

    public LunchOrderTele (String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
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
