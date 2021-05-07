package net.yan.pet.controllers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "order")
public interface OrderFeignClient {

    @GetMapping("/order/{orderId}")
    String getOrder(@PathVariable("orderId") String orderId);
}
