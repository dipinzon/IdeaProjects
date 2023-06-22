package com.example.myspringproject.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @GetMapping("/helloworld")
    public String helloWorld()
    {
        return "Hello World";
    }
    //http://localhost:8080/helloworld

    //Testing with CURL
    /*Curl, short for Client for URLs, is a command line
      tool that allows us to transfer data to and from a
      server. It supports multiple protocols,
      including HTTP.
      curl http://localhost:8080/helloworld */
    @RequestMapping("/mapping")
    public String helloMapping()
    {
        return "Mapping";
    }
}
