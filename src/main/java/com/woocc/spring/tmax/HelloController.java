package com.woocc.spring.tmax;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/greeting")
    public String index()
    {
        return "Greeting From Spring Boot!";
    }
}
