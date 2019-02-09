package com.lutong.abstractFactory;

/**
 * @author lutong
 * @date 2/7/2019 - 10:17 AM
 */

//工厂用于生产  卡车+轿车
public interface Factroy  {
    //返回接口  上转       （方便）
    //对应了接口的个数
    public Trunk createTrunk();
    public Sedan createSedan();
}
