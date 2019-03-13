package com.anhe.no3abstractfactory;

/**
 * Created by Albert.Tang on 2019/3/12 3:31 PM.
 */
public class ABFactory implements AbstractFactory{
    @Override
    public ProductA createA() {
        return new ProductA();
    }

    @Override
    public ProductB createB() {
        return new ProductB();
    }
}
