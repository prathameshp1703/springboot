package com.heavycoder.springboot.demo.firstspringapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("CricketCoach")
@Lazy
@Primary
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("Cricket coach initilied!!");
    }

    public String getWorkoutPlan(){
        return "Do batting for 30 minutes!";
    }
}