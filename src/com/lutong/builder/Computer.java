package com.lutong.builder;

/**
 * @author lutong
 * @date 2/8/2019 - 7:58 PM
 */


//bean实体对象 （产品部件）
public class Computer {


    private String mainBoard;
    private String cpu;
    private String hardDisk;

    @Override
    public String toString() {
        return "Computer{" +
                "mainBoard='" + mainBoard + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                '}';
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }
}
