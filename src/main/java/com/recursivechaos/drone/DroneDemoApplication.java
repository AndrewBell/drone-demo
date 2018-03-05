package com.recursivechaos.drone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DroneDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DroneDemoApplication.class, args);
    }

    @RequestMapping("/greeting")
    public String getGreeting(@RequestParam(name = "name", defaultValue = "world") String name) {
        return buildGreeting(name);
    }

    public static String buildGreeting(String name) {
        return "Hello " + name;
    }

}
