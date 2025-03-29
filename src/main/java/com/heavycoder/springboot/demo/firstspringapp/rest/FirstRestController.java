package com.heavycoder.springboot.demo.firstspringapp.rest;

import com.heavycoder.springboot.demo.firstspringapp.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    Coach coach1;
    Coach coach2;

    @Autowired
    public FirstRestController(@Qualifier("CricketCoach") Coach cricketCoach, @Qualifier("F1Coach") Coach f1Coach){
        this.coach1 = cricketCoach;
        this.coach2 = f1Coach;
    }

    @GetMapping("/cricket")
    public String getCricketCoach() {
        return coach1.getWorkoutPlan();
    }

    @GetMapping("/f1")
    public String getF1Coach(){
        return coach2.getWorkoutPlan();
    }
}

