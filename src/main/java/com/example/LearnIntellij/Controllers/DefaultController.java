package com.example.LearnIntellij.Controllers;

import com.example.LearnIntellij.Services.GetCurrentTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cool")
public class DefaultController {

    @Autowired
    GetCurrentTimeService getCurrentTimeService;

    @GetMapping("/currentTime")
    public String currentTime(){
        return getCurrentTimeService.getCurrentTime();
    }
}
