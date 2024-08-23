package com.jiawa.train.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小小低头哥
 * @version v1.0
 * @api
 * @since 2024年 月 日
 */

@RestController
public class TestController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}
