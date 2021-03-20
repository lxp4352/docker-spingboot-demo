package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zwl on 2018/12/9.
 * May god bless me
 *
 * @Auther: WenliangZhang
 * @Description zzu.zwl.controller
 * @version: 1.0
 */

@RestController
@RequestMapping("/")
public class HelleController {

    @GetMapping("/hello")
    public String method(){
        return  "HelloWorld-Docker"+new Date().toString();
    }
}
