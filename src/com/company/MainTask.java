package com.company;

public class MainTask {

    public static void main(String[] args) throws MyExceptions {

        Task5 lunchTime = new Task5();
        lunchTime.feedCat(lunchTime.catName,"Sunday", true, true);
        lunchTime.getDrinkBottle();
        lunchTime.setDrinkBottle(-60);
        lunchTime.getDrinkBottle();

    }
}

