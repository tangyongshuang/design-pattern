package com.anhe.simplefactory;

/**
 * Created by Albert.Tang on 2019/3/11 6:37 PM.
 */
public abstract class AbstractProduct {

    public void methodSame() {
        System.out.println("这是抽象产品的公共方法！");
    }

    public abstract void methodDiff();

    public static AbstractProduct getProduct(String arg) {
        AbstractProduct product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ProductA();
        } else if (arg.equalsIgnoreCase("B")) {
            product = new ProductB();
        }
        return product;
    }

    public static void main(String[] args) {

    }
}
