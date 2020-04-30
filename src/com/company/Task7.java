package com.company;

import java.util.Scanner;

public class Task7 extends Task5 {

    public static void main(String[] args) {
    }

    String[] catFood;
    private int[] foodBox;
    private int dish;

    {
        catFood = new String[]{"Porridge", "Sausages", "Sour cream"};
        foodBox = new int[] {500, 300, 600};
        dish = 400;
    }

    public Task7() {
        super();
        super.catFood = this.catFood;
        super.foodBox = this.foodBox;
        super.dish = this.dish;
        System.out.println("Specifics of Siamese cats. Here we will use same drinks as in Task5");
    }

    @Override
    public void isFoodBoxEmpty() {
        super.isFoodBoxEmpty();
    }

    @Override
    public String getValue() {
        System.out.println("The value is returned from parent" + super.value);
        return super.getValue();

    }

    @Override
    public int addFoodToDish() {
        int boxTotal = super.foodBox[super.indexBox];
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if (amount <= super.dish & boxTotal >= amount) {
            super.foodBox[super.indexBox] = boxTotal - amount;
            System.out.println("Food is added to the dish");
            return amount;
        } else if (amount > super.dish) {
            System.out.println("So much food CAN NOT be added to the dish");
            return 0;
        } else {
            System.out.println("There is no enough food in this box");
            return 0;
        }
    }

    @Override
    public int addDrinkToDish() {
        int bottleTotal = super.drinkBottle;
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if (amount <= super.dish & super.drinkBottle >= amount) {
            super.drinkBottle = bottleTotal - amount;
            System.out.println("Drink is added to the dish");
            return amount;
        } else if (amount > super.dish) {
            System.out.println("So much drink CAN NOT be added to the dish");
            return 0;
        } else {
            System.out.println("There is no enough drink in this bottle");
            return 0;
        }
    }

}