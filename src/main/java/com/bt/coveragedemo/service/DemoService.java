package com.bt.coveragedemo.service;

import com.bt.coveragedemo.bean.UserBean;
import com.bt.coveragedemo.controller.DemoController;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DemoService {
    public Map demo1(UserBean userBean) {
        Map<String, Object> map = new HashMap<>();
        if (userBean.getName().length() < 2) {
            map.put("name", userBean.getName() + userBean.getName() + userBean.getName());
        } else {
            map.put("name", userBean.getName());
        }

        if (userBean.getAddress().length() < 12) {
            map.put("address", userBean.getAddress() + userBean.getAddress() + userBean.getAddress());
        } else {
            map.put("address", userBean.getAddress());
        }

        if (userBean.getAge() > 10) {
            map.put("age", userBean.getAge() * 100);
        } else {
            map.put("age", userBean.getAge());
        }
        return map;
    }
}
