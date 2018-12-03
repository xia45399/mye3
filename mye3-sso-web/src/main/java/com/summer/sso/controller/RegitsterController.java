package com.summer.sso.controller;

import com.summer.common.utils.E3Result;
import com.summer.mye3.sso.service.RegisterService;
import com.summer.pojo.TbUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class RegitsterController {

    @Resource
    private RegisterService registerService;

    @RequestMapping("/page/register")
    public String showRegister() {
        return "register";
    }

    @RequestMapping("/user/check/{param}/{type}")
    @ResponseBody
    public E3Result checkData(@PathVariable String param, @PathVariable Integer type) {
        E3Result e3Result = registerService.checkData(param, type);
        return e3Result;
    }

    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    @ResponseBody
    public E3Result register(TbUser user) {
        E3Result e3Result = registerService.register(user);
        return e3Result;
    }
}

