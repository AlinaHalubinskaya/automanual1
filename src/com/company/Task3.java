package com.company;

public class Task3 {
    public static void main(String[] args) {

        int[] myArray = new int[100]; {

            for (int Forward = 1; Forward <= 99; Forward += 2) {
                System.out.print(" " + Forward);
            }
        }
        System.out.print(" \n");

        int[] myArray2 = new int[100]; {

            for (int Backward = 99; Backward >= 1; Backward -= 2) {
                System.out.print(" " + Backward);
            }
        }
    }
}