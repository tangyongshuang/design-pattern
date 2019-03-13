package com.anhe.no2factorymethod;

/**
 * Created by Albert.Tang on 2019/3/12 2:01 PM.
 * 具体工厂类在实现工厂方法时除了创建具体产品对象之外，还可以负责产品对象的初始化工作以及一些资源和环境配置工作，例如连接数据库、创建文件等。
 */
public class ProductAFactory implements Factory {
    @Override
    public Product factory() {
        return new ProductA();
    }
}
