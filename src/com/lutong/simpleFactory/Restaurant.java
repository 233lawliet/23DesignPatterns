package com.lutong.simpleFactory;

/**
 * @author lutong
 * @date 2/3/2019 - 9:56 AM
 */
public class Restaurant {

    public static  Food CreateFood(String foodName){
        switch (foodName) {
            case "rice":{
                return new Rice();
            }
            case "chicken":{
                return  new Rice();
            }
            case  "bread":{
                return new Bread();
            }
            case "cake":{
                return new Cake();
            }
            default:{
                return null;
            }
        }
    }
}
