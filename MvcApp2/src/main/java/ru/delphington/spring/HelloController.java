package ru.delphington.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHello(){
        return "hello-worldbbbbbb";
    }
}
