package com.company;

public class Task5 {

    public static void main(String[] args) {
    }

    private String catName;
    private String catFood;
    private String catDrink = "Milk";
    String weekDay;
    private boolean hungry;
    private boolean dishEmpty;
    private int dish = 300;
    private int foodBox = 1000;
    private int drinkBottle = 900;


    public void setName(String name) {
        this.catName = name;
    }

    public String getName() {
        return catName;
    }

    public void setCatFood(String catFood) {
        this.catFood = catFood;
        System.out.println("Today it will be tasty " + catFood);
    }

    public String getCatFood() {
        return catFood;
    }

    public void setCatDrink(String catDrink) {
        this.catDrink = catDrink;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isHungry() {
        return hungry;
    }

    public int getBoxState() {
        return foodBox;
    }

    public int getBottleState() {
        return drinkBottle;
    }

    public static void callCatToTheKitchen(String catName) {
        System.out.println("Mommy has brought you some food, " + catName);

    }

    public void addFoodToDishOn(String weekDay) {
        if (isHungry()) {
            this.weekDay = weekDay;
            if (this.weekDay == "Monday" || this.weekDay == "Thursday") {
                setCatFood("KittyCat");
            }
            if (this.weekDay == "Tuesday" || this.weekDay == "Friday") {
                setCatFood("Farmina");
            }
            if (this.weekDay == "Wednesday" || this.weekDay == "Saturday") {
                setCatFood("Optima");
            }
            else if (this.weekDay== "Sunday"){
//                setCatDrink(catDrink);
                System.out.println("Let me pour you some " + catDrink);
            }

        } else {
            System.out.println("You are not hungry, " + catName);
        }
    }

//     public void feedCat(String[] weekDay, String name) {
//        if (hungry & dishEmpty) {
//            if (weekDay < this.weekDay.[this.weekDay.length] ){
//                addFoodToDish();
//                callCatToTheKitchen(name);
//            }
//            if (weekDay == this.weekDay.length) {
//                addDrinkToDish();
//            }
//        } else {
//            System.out.println("You are not hungry, " + name);
//        }
//    }
}






