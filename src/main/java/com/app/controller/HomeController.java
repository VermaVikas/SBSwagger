package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String sayHello() {

        return "Swagger Hello World";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {

        return "Swagger Hello World test";
    }
}


