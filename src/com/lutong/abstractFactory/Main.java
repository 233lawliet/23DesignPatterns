package com.lutong.abstractFactory;

import com.lutong.factroyMethod.BMTrunk;

/**
 * @author lutong
 * @date 2/7/2019 - 10:34 AM
 */
public class Main {
    public static void main(String[] args) {
        BMWFactory bmwFactory=new BMWFactory();
        Trunk bmwTrunk= bmwFactory.createTrunk();
        bmwTrunk.run();
    }
}
