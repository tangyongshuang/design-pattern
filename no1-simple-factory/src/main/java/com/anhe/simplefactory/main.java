package com.anhe.simplefactory;

/**
 * Created by Albert.Tang on 2019/3/11 6:40 PM.
 */
public class main {
    public static void main(String[] args) {
        // String chartType = XMLUtil.getChartType();
        // Product product = SimpleFactory.getProduct(chartType);
        AbstractProduct product = AbstractProduct.getProduct("A");
        product.methodSame();
        product.methodDiff();



    }
}
