package com.lutong.factroyMethod;

/**
 * @author lutong
 * @date 2/3/2019 - 11:56 AM
 */
public class Main {
    public static void main(String[] args) {
        //多态 向上转型
        TrunkFactroy dzTrunkFactroy=new DZTrunkFactory();
        dzTrunkFactroy.createTrunk().sayName();
    }
}
