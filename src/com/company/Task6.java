package com.company;

public class Task6 {

    public static void main(String[] args) {

        Task5 lunchTime = new Task5();
        lunchTime.setName("Pushok");
        System.out.println(lunchTime.getName());
        lunchTime.callCatToTheKitchen("Pushok");
        lunchTime.setHungry(true);
        lunchTime.addFoodToDishOn("Monday");

    }
}

