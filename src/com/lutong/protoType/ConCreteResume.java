package com.lutong.protoType;

/**
 * @author lutong
 * @date 2/8/2019 - 10:21 PM
 */
public class ConCreteResume implements Resume {

    @Override
    public Resume clone() {
        Resume resume=new ConCreteResume();
        return  resume;
    }
}
