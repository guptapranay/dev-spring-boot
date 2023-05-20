package com.learn.springboot.demo.mycoolapp.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FunRestController {
    //expose REST endpoint that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
