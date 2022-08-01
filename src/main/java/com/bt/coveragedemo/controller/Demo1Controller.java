package com.bt.coveragedemo.controller;


import com.bt.coveragedemo.service.Demo1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Demo1Controller {

    @Autowired
    private Demo1Service demo1Service;

    @RequestMapping("demo1/{a}/{b}")
    public Map demo1(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        Map<Object, Object> objectObjectHashMap = new HashMap<>();
        int value = demo1Service.doCount(a, b);
        objectObjectHashMap.put("count", value);
        return objectObjectHashMap;
    }
}
