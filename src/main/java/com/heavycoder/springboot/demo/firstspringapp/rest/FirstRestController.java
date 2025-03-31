package com.heavycoder.springboot.demo.firstspringapp.rest;

import com.heavycoder.springboot.demo.firstspringapp.common.Coach;
import com.heavycoder.springboot.demo.firstspringapp.common.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
    CricketCoach coach1;
    CricketCoach coach2;
    @Autowired
    public FirstRestController(@Qualifier("CricketCoach") CricketCoach cricketCoach, @Qualifier("CricketCoach") CricketCoach cricketCoach1)
    {
        System.out.println("FirstRestController initialized!!!");
        this.coach1 = cricketCoach;
        this.coach2 = cricketCoach1;
        System.out.println("cricketCoach = " + cricketCoach + ", cricketCoach1 = " + cricketCoach1);
    }

    @GetMapping("/cricket")
    public String getCricketCoach() {
        coach1.setAge(30);

        return coach2.getWorkoutPlan();
    }
}

