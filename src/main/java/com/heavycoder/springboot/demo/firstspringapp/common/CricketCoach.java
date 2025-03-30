package com.heavycoder.springboot.demo.firstspringapp.common;

import org.springframework.stereotype.Component;

@Component("CricketCoach")
public class CricketCoach implements Coach{

    public String getWorkoutPlan(){
        return "Do batting for 30 minutes!";
    }

}
