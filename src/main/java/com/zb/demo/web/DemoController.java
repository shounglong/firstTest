package com.zb.demo.web;

/**
 * 测试Controller
 * @author tsl
 * @Data 2020-10-10
 */

import com.zb.demo.entity.UserTest;
import com.zb.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class DemoController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "userFindList")
    @ResponseBody
    public List<UserTest> userFindList(){
        List<UserTest> list = userService.userFindList();
        return list;
    }





}
