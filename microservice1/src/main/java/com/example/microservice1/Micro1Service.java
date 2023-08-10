package com.example.microservice1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "microservice2")
public interface Micro1Service {
    @GetMapping
    String hello();
    @PostMapping("/message/{id}")
    MessageDTO message(@PathVariable Long id);
}
