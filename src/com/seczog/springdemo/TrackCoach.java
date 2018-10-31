package com.seczog.springdemo;

public class TrackCoach implements Coach {

    public FortuneService theFortuneService;

    public TrackCoach(FortuneService theFortuneService) {
        this.theFortuneService = theFortuneService;
    }

    @Override
    public String getDailyFortune() {
        return theFortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
