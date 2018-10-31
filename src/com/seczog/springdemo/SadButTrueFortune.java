package com.seczog.springdemo;

public class SadButTrueFortune implements FortuneService{


    @Override
    public String getFortune() {
        return "We are all dying ;>)";
    }
}
