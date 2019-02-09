package com.lutong.factroyMethod;

/**
 * @author lutong
 * @date 2/3/2019 - 11:54 AM
 */
public class BMTrunkFactroy implements TrunkFactroy {
    @Override
    public Trunk createTrunk() {
        return new BMTrunk();
    }
}
