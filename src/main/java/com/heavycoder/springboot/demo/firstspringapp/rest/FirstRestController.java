package com.heavycoder.springboot.demo.firstspringapp.rest;

import com.heavycoder.springboot.demo.firstspringapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
    Coach coach1;
    // Since the cricketCoach primary when no coach is specified without the Qualifier
    // the cricket coach will be used.
    @Autowired
    public FirstRestController(Coach cricketCoach)
    {
        System.out.println("FirstRestController initialized!!!");
        this.coach1 = cricketCoach;
    }

    @GetMapping("/cricket")
    public String getCricketCoach() {
        return coach1.getWorkoutPlan();
    }
}

