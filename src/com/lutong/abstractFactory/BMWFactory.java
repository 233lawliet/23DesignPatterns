package com.lutong.abstractFactory;

/**
 * @author lutong
 * @date 2/7/2019 - 10:19 AM
 */
public class BMWFactory implements Factroy {
    @Override
    public Trunk createTrunk() {
        return new BMWTrunk();
    }

    @Override
    public Sedan createSedan() {
        return new BMWSedan();
    }
}
