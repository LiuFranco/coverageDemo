package com.bt.coveragedemo.controller;

import com.bt.coveragedemo.bean.UserBean;
import com.bt.coveragedemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @PostMapping("demo1")
    public Map demo1(@RequestBody UserBean userBean) {
        if (userBean.getAddress() == null) {
            return new HashMap<>();
        }
        if (userBean.getName() == null) {
            return new HashMap<>();
        }
        if (userBean.getAge() == 0) {
            return new HashMap<>();
        }
        if (userBean.getAge() == 10) {
           System.out.println("DemoController.demo1");
        }
        
        return demoService.demo1(userBean);

    }

}
