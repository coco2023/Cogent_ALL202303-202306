package com.cogent.dockerDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

    @RequestMapping("/hello")
    public String index() {
        return "Hello Han!";
    }

}
