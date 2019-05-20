package com.atguigu.mock.util;

import java.util.Random;

/**
 * @author zz
 * @date 2019/5/20.
 */
public class RandomNum {

    public static final  int getRandInt(int fromNum,int toNum){
        return   fromNum+ new Random().nextInt(toNum-fromNum+1);
    }
}
