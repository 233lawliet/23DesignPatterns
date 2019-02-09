package com.lutong.builder;

/**
 * @author lutong
 * @date 2/8/2019 - 8:05 PM
 */


//抽象方法声明
public interface Builder {

    //进行配置
    public abstract void buildHD();
    public abstract void buildMB();
    public abstract void buildCPU();

    //合成电脑
    public abstract Computer buildComputer();
}
