package org.example.dockerdemobatchnov2024.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("{name}")
    public String print(@PathVariable String name) {
        System.out.println("Hello "+name);
        return name;
    }
}
