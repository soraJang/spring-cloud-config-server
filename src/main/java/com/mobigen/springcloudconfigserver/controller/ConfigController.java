package com.mobigen.springcloudconfigserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class ConfigController {

    @GetMapping(path="/method")
    public String methodTest() {
        return "methodTest";
    }
}