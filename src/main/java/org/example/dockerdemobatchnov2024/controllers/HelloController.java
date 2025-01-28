package org.example.dockerdemobatchnov2024.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @GetMapping("/{name}")
    public void print(@PathVariable  String name) {
       System.out.println("Hello "+name);
   }
}
