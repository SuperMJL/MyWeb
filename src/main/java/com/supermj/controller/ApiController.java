package com.supermj.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ApiController {
    @ResponseBody
    @GetMapping( value = "/helloWorld")
    public Object helloWorld(){
        return "helloWorld";
    }
}
