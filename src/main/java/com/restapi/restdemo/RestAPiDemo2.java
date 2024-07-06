package com.restapi.restdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teas")
public class RestAPiDemo2 {

    @GetMapping("/")
    ResponseEntity<String> printteas(){
        System.out.println("teas");

        return new ResponseEntity<>("TEST", HttpStatus.OK);
    }
}
