package com.lutong.builder;

/**
 * @author lutong
 * @date 2/8/2019 - 8:09 PM
 */


//构建结构（配置）
public class ComputerABuilder implements Builder{


    //
    private  Computer  computer=new Computer();

    @Override
    public void buildHD() {
        computer.setHardDisk("sanxing");
    }

    @Override
    public void buildMB() {
        computer.setMainBoard("技嘉");
    }

    @Override
    public void buildCPU() {
        computer.setCpu("因特尔");
    }

    @Override
    public Computer buildComputer() {
        return this.computer;
    }
}
