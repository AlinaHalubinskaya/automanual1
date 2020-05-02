package com.company;

public class Task10 {

    public static void main(String[] args) {

        System.out.println("Variant 1");

        String myString = "Hello my dear teacher";
        String first = myString.substring(0, 5);
        String second = myString.substring(6, 8);
        String third = myString.substring(9, 13);
        String forth = myString.substring(14, 21);
        System.out.print(forth + " " + third + " " + second + " " + first + "\n");

        System.out.println("\n" + "Variant 2");

        String myString2 = "Hello my dear teacher";
        String[] words = myString2.split(" ");
        for (int i = 3; i <= words.length & i >=0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}