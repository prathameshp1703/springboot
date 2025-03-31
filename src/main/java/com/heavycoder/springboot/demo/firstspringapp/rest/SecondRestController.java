package com.heavycoder.springboot.demo.firstspringapp.rest;

import com.heavycoder.springboot.demo.firstspringapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carsports")
public class SecondRestController {

    Coach coach;
    @Autowired
    public SecondRestController(@Qualifier("F1Coach") Coach f1Coach)
    {
        System.out.println("Second rest controller initialized!!");
        this.coach = f1Coach;
    }

    @GetMapping("/f1")
    public String getCoach()
    {
        return coach.getWorkoutPlan();
    }
}
