package com.heavycoder.springboot.demo.firstspringapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("CricketCoach")
@Lazy
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
    public int age = 10;
    public CricketCoach(){
        System.out.println("Cricket coach initilized!!");
    }

    public String getWorkoutPlan(){
        return "Do batting for " + age+ " minutes if your age is " + this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}