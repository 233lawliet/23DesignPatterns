package com.lutong.simple;

/**
 * @author lutong
 * @date 2/7/2019 - 11:31 PM
 */
public class Main {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                System.out.println(SingleTon.getInstance());
            }
        }.start();
        new Thread() {
            public void run() {
                System.out.println(SingleTon.getInstance());
            }
        }.start();
        new Thread() {
            public void run() {
                System.out.println(SingleTon.getInstance());
            }
        }.start();

    }
}
