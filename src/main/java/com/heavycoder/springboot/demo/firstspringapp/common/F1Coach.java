package com.heavycoder.springboot.demo.firstspringapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("F1Coach")
@Lazy
public class F1Coach implements Coach{
    public String getWorkoutPlan(){
        return "Do squats for 20 minutes!!";
    }
}
