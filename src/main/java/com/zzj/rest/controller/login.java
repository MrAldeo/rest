package com.zzj.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhangzijie
 * @Date: 2019/10/9 14:38
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
@RestController
@RequestMapping("/api/")
public class login {
    @RequestMapping("login")
    public String login(){
        return "登陆成功";
    }
}
