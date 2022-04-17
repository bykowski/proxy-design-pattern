package com.example.springproxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProxyApplication.class, args);
    }

    @Autowired
    IUserService iUserService;

    @Autowired
    UserService userService;

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        iUserService.hello();
        userService.hello();
    }
}
