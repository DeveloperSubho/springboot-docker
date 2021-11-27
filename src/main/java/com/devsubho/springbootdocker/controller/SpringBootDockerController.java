package com.devsubho.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author subha
 * @project springboot-docker
 * @created 27/11/2021 - 18:36
 * @user subha
 */

@RestController
@RequestMapping(value = "/docker")
public class SpringBootDockerController {

    @GetMapping
    public String index() {
        return "Spring Boot Docker Example";
    }
}
