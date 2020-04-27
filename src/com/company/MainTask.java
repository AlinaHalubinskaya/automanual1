package com.company;

public class MainTask {

    public static void main(String[] args) {

        Task5 lunchTime = new Task5();
        lunchTime.setName("Pushok");
        System.out.println(lunchTime.getName());
        lunchTime.callCatToTheKitchen(lunchTime.catName);
        lunchTime.feedCat(lunchTime.catName,"Tuesday", true, true);
        lunchTime.feedCat(lunchTime.catName,"Tuesday", false, true);
        lunchTime.feedCat(lunchTime.catName,"Tuesday", true, false);

        Task7 lunchtimeForSiamese = new Task7();
        lunchTime.setName("Barsik");
        System.out.println(lunchTime.getName());
        lunchTime.callCatToTheKitchen(lunchTime.catName);
        lunchtimeForSiamese.feedCat(lunchTime.catName, "Sunday", true, true);
        lunchtimeForSiamese.feedCat(lunchTime.catName, "Sunday", false, true);
        lunchtimeForSiamese.feedCat(lunchTime.catName, "Wednesday", true, false);



    }
}

