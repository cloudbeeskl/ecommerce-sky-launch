package com.acmewidgets.ecommerce.ecommerceskylaunch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EcommerceSkyLaunchApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceSkyLaunchApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hello ECommerce Sky Launch";
    }
}
