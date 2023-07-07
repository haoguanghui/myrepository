package com.example.springdemo.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
/**
 * @author: hgh
 * @description: TODO
 * @date: 2023/7/7 13:57
 * @version: 1.0
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String helloWorld() {
        System.out.println("132");
        return "Hello World";
    }
    /**
     * @return String
     * @author hgh
     * @description TODO
     * @date 2023/7/7 14:55
     */
    @RequestMapping("/test")
    public String test() {
        int count = 10;
        for (int j = 0; j < 10; j++) {
            count++;
            System.out.println(count);
        }
        System.out.println("测试提交！");
        return "test";
    }
}
