package com.anhe.simplefactory;

/**
 * Created by Albert.Tang on 2019/3/11 6:42 PM.
 */
public class SimpleFactory {
    public static AbstractProduct getProduct(String arg) {
        AbstractProduct product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ProductA();
        } else if (arg.equalsIgnoreCase("B")) {
            product = new ProductB();
        }
        return product;
    }
}
