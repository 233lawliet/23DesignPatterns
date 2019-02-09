package com.lutong.builder;

/**
 * @author lutong
 * @date 2/8/2019 - 8:34 PM
 */

//配置
public class ComputerBBuilder implements Builder{

    private Computer computer=new Computer();
    @Override
    public void buildHD() {
        computer.setHardDisk("华硕");
    }

    @Override
    public void buildMB() {
        computer.setMainBoard("技嘉");
    }

    @Override
    public void buildCPU() {
        computer.setCpu("AMD");
    }

    @Override
    public Computer buildComputer() {
        return this.computer;
    }
}
