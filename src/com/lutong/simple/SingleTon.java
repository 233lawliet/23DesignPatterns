package com.lutong.simple;

/**
 * @author lutong
 * @date 2/7/2019 - 10:26 PM
 */
public class SingleTon {

    //用于限制其他地方的new
    private SingleTon(){
      //pass
    }
    //实例化对象
     public static SingleTon singleTon =null;


    //双重锁
     public static SingleTon getInstance(){
        if(singleTon==null) {
            synchronized (SingleTon.class) {
                if(singleTon==null){
                    singleTon=new SingleTon();
                }
            }
        }
        return singleTon;
    }
}
