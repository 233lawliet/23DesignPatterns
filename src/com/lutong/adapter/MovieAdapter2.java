package com.lutong.adapter;

/**
 * @author lutong
 * @date 2/9/2019 - 11:43 PM
 */
public class MovieAdapter2 implements PlayMovie {

    private PlayMp4Movie playMp4Movie=new PlayMp4Movie();
    @Override
    public void playMovie() {
        playMp4Movie.PlayMP4();
    }
}
