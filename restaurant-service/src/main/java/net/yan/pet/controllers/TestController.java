package net.yan.pet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/")
public class TestController {

    @GetMapping(value = "/test/{testId}")
    public String test(@PathVariable("testId") String testId) {

        return "Test " + testId;
    }
}
