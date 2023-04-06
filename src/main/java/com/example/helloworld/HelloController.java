package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        LocalDateTime nowTime = LocalDateTime.now();
        DateTimeFormatter formattingTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mmです");
        String formattedTime = formattingTime.format(nowTime);
        return "Hello World!! 現在時刻（日本）は" + formattedTime;
    }
}
