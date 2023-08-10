package com.example.microservice1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Demo1Controller {
 private final Micro1Service micro1Service;

    public Demo1Controller(Micro1Service micro1Service) {
        this.micro1Service = micro1Service;
    }

    @GetMapping
    public ResponseEntity<String> hello(){
        String result = micro1Service.hello();
        return ResponseEntity.ok(result);
    }
    @GetMapping("/message")
    public ResponseEntity<MessageDTO> hello(Long id){
        MessageDTO result =micro1Service.message(id);
        result.setCreatedDate(new Date().getTime());
        return ResponseEntity.ok(result);
    }
}
