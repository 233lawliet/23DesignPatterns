package com.lutong.builder;

/**
 * @author lutong
 * @date 2/8/2019 - 8:17 PM
 */
public class Main {

    public static void main(String[] args) {
        Computer computer1=Director.constructorComputer(new ComputerABuilder());
        Computer computer2=Director.constructorComputer(new ComputerBBuilder());
        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
    }
}
