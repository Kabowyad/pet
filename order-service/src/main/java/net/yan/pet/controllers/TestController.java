package net.yan.pet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/order/{orderId}")
    private String getOrder(@PathVariable("orderId") String orderId) {

        return "Hello, this is order: " + orderId;
    }
}
