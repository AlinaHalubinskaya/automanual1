package com.company;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
    }

    protected String catName;
    protected static String[] catFood = {"KittyCat", "Farmina", "Optima"};
    private int[] foodBox = {900, 600, 1200};
    private int indexBox;
    private String catDrink = "Milk";
    private int drinkBottle = 750;
    private String weekDay;
    private boolean hungry;
    private boolean dishEmpty;
    private int dish = 300;
    private String value;

    public void setName(String name) {
        this.catName = name;
    }

    public String getName() {
        return catName;
    }

    public void setCatFood(String catFood) {
        for (int i = 0; i <= this.catFood.length; i++) {
            if (this.catFood[i] == catFood) {
                this.value = catFood;
                System.out.println("Today it will be tasty " + catFood);
                return;
            }
        }
    }

    public int getDrinkBottle() {
        System.out.println("There is " + drinkBottle + " milk in this bottle");
        return drinkBottle;
    }

    public String getValue() {
        System.out.println("The value is " + value);
        return value;
    }

    public static void callCatToTheKitchen(String catName) {
        System.out.println("Mommy has brought you some food, " + catName);

    }

    public void chooseFood(String weekDay, boolean hungry) {
        if (hungry) {
            this.weekDay = weekDay;
            if (this.weekDay == "Monday" || this.weekDay == "Thursday") {
                setCatFood(this.catFood[0]);
            }
            if (this.weekDay == "Tuesday" || this.weekDay == "Friday") {
                setCatFood(this.catFood[1]);
            }
            if (this.weekDay == "Wednesday" || this.weekDay == "Saturday") {
                setCatFood(this.catFood[2]);
            } else if (this.weekDay == "Sunday") {
                System.out.println("Let me pour you some " + catDrink);
            }

        } else {
            System.out.println("You are not hungry, dear");
        }
    }

    public void isFoodBoxEmpty() {
        for (int i = 0; i < this.catFood.length; i++) {
            if (this.catFood[i] == value) {
                this.indexBox = i;
                System.out.println(this.foodBox[i]);
                System.out.println("There is " + this.foodBox[indexBox] + " food in this box");
                return;
            }
        }
    }

    public int addFoodToDish() {
        int boxTotal = this.foodBox[this.indexBox];
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if (amount <= this.dish & boxTotal >= amount) {
            this.foodBox[this.indexBox] = boxTotal - amount;
            System.out.println("Food is added to the dish");
            return amount;
        } else if (amount > this.dish) {
            System.out.println("So much food CAN NOT be added to the dish");
            return 0;
        } else {
            System.out.println("There is no enough food in this box");
            return 0;
        }
    }

    public int addDrinkToDish() {
        int bottleTotal = this.drinkBottle;
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if (amount <= this.dish & this.drinkBottle >= amount) {
            this.drinkBottle = bottleTotal - amount;
            System.out.println("Drink is added to the dish");
            return amount;
        } else if (amount > this.dish) {
            System.out.println("So much drink CAN NOT be added to the dish");
            return 0;
        } else {
            System.out.println("There is no enough drink in this bottle");
            return 0;
        }
    }


    public void feedCat(String name, String weekDay, boolean dishEmpty, boolean hungry) {
        if (dishEmpty & hungry & weekDay != "Sunday") {
            chooseFood(weekDay, hungry);
            isFoodBoxEmpty();
            addFoodToDish();
            System.out.println(this.foodBox[indexBox] + " remains in this box");
        } else if (dishEmpty & hungry & weekDay == "Sunday") {
            chooseFood(weekDay, hungry);
            getDrinkBottle();
            addDrinkToDish();
            System.out.println(this.drinkBottle + " remains in this bottle");
        } else if (dishEmpty & !hungry) {
            System.out.println("You have just eaten everything. Go for a walk. ");

        } else if (!dishEmpty & hungry) {
            System.out.println("Your dish is already full");

        } else {
            chooseFood(weekDay, hungry);
        }
    }
}


