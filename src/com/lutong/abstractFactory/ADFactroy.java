package com.lutong.abstractFactory;

/**
 * @author lutong
 * @date 2/7/2019 - 10:20 AM
 */



public class ADFactroy implements Factroy {
    @Override
    public Trunk createTrunk() {
        return new ADTrunk();
    }

    @Override
    public Sedan createSedan() {
        return new ADSedan();
    }
}
