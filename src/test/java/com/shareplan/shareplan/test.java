package com.shareplan.shareplan;

import com.shareplan.shareplan.utils.Commons;

/**
 * Created by YangKui on 2018/4/28
 */
public class test {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String random = Commons.random(5, ".png");
            System.out.println(random);
        }

    }
}
