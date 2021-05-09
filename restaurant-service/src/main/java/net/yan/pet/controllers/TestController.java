package net.yan.pet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private OrderFeignClient orderFeignClient;

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return orderFeignClient.getOrder("42");
    }

}
