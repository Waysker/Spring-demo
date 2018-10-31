package com.seczog.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService theFortuneService;

    public BaseballCoach(FortuneService theFortuneService) {
        this.theFortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "30 situps";
    }

    @Override
    public String getDailyFortune() {
        return "DontBeSoHappy: "+theFortuneService.getFortune();
    }


}
