package com.heavycoder.springboot.demo.firstspringapp.rest;

import com.heavycoder.springboot.demo.firstspringapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @Autowired
    @Qualifier("CricketCoach")
    Coach coach1;

    @Autowired
    @Qualifier("F1Coach")
    Coach coach2;

    @GetMapping("/cricket")
    public String getCricketCoach() {
        return coach1.getWorkoutPlan();
    }

    @GetMapping("/f1")
    public String getF1Coach(){
        return coach2.getWorkoutPlan();
    }
}

