package org.chbc;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/h1")
    public String helloWorld1() {
        System.out.println("h1");
        return "Hello, World 1!";
    }

    @GetMapping("/h2")
    public String helloWorld2() {
        return "Hello, World 2!";
    }
}
