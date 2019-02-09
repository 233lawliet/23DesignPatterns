package com.lutong.factroyMethod;

/**
 * @author lutong
 * @date 2/3/2019 - 11:55 AM
 */
public class ADTrunkFactory implements TrunkFactroy{
    @Override
    public Trunk createTrunk() {
        return new ADTrunk();
    }
}
