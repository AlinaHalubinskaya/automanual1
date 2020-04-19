package com.company;

public class Task6 {

    public static void main(String[] args) {

        Task5 lunchTime = new Task5();
        lunchTime.setName("Pushok");
        System.out.println(lunchTime.getName());
        lunchTime.callCatToTheKitchen(lunchTime.catName);
        lunchTime.feedCat(lunchTime.catName,"Monday", true, true);
        lunchTime.feedCat(lunchTime.catName,"Thursday", true, true);
        lunchTime.feedCat(lunchTime.catName,"Friday", false, true);
        lunchTime.feedCat(lunchTime.catName,"Sunday", true, true);



    }
}

