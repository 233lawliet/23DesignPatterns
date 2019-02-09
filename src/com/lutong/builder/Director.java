package com.lutong.builder;

/**
 * @author lutong
 * @date 2/8/2019 - 8:18 PM
 */

//将产品建造（组装）
public class Director {
    //传入配置
    public  static Computer constructorComputer(Builder builder){
        builder.buildCPU();
        builder.buildHD();
        builder.buildMB();
        return builder.buildComputer();
    }
}
