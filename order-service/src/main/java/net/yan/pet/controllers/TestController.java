package net.yan.pet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import net.yan.pet.clients.restaurant.RestaurantFeignClient;

@RestController
@RequestMapping(value = "v1/")
public class TestController {

    private CircuitBreakerRegistry circuitBreakerRegistry = CircuitBreakerRegistry.ofDefaults();

    private CircuitBreaker circuitBreaker = circuitBreakerRegistry.circuitBreaker("default");

    @Autowired
    private RestaurantFeignClient restaurantFeignClient;

    @GetMapping(value = "/test")
    public String test() {

        String testId = "42";
        return circuitBreaker.executeSupplier(() -> restaurantFeignClient.getTest(testId));
    }
}
