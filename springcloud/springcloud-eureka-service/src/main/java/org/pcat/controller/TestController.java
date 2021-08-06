package org.pcat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoy
 **/
@RestController
@RequestMapping("/api/p/test")
public class TestController {


//    @RequestMapping("/sys")
    @GetMapping("/sys")
    public String pcat(String s) {
        System.out.println("输出的值是：" + s);
        return "输出的值是：" + s;
    }
}
