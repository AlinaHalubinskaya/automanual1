package com.company;

public class MainTask {

    public static void main(String[] args) {

        Task5 lunchTime = new Task5();
        lunchTime.setName("Pushok");
        System.out.println(lunchTime.getName());
        lunchTime.callCatToTheKitchen(lunchTime.catName);
        lunchTime.feedCat(lunchTime.catName,"Tuesday", true, false);

        Task7 lunchtimeForSiamese = new Task7();
        lunchtimeForSiamese.feedCat(lunchTime.catName, "Wednesday", false, true);
        lunchTime.washDish(lunchTime.isDishEmpty());


    }
}

