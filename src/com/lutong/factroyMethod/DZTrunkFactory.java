package com.lutong.factroyMethod;

/**
 * @author lutong
 * @date 2/3/2019 - 12:17 PM
 */
public class DZTrunkFactory implements TrunkFactroy{
    @Override
    public Trunk createTrunk() {
        return new DZTrunk();
    }
}
