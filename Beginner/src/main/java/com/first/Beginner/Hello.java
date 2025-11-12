package com.first.Beginner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    private final Nayi nayi;

    public Hello(){
        nayi =new Nayi();
    }

    @GetMapping("/")
    public String greet(){
        return "Hello shashi";
    }


    @GetMapping("/getnayi")
    public Nayi getnode(){
        return nayi;
    }

}
