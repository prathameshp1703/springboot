package com.heavycoder.springboot.demo.firstspringapp.common;

import org.springframework.stereotype.Component;

@Component("F1Coach")
public class F1Coach implements Coach{

    public String getWorkoutPlan(){
        return "Do squats for 20 minutes!!";
    }
}
