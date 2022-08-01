package com.bt.coveragedemo.service;


import org.springframework.stereotype.Service;

@Service
public class Demo1Service {


    public Integer doCount(int a,int b){
        int value;
        if (a > 100) {
            value = a - b;
        } else {
            value = a + b;
        }
        return value;
    }
}
