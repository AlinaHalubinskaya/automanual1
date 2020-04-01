package com.company;

public class Task3 {
    public static void main(String[] args) {

       for (int Forward = 1; Forward <= 99; Forward += 2) {
                System.out.print(" " + Forward);
            }
        System.out.print(" \n");

       for (int Backward = 99; Backward >= 1; Backward -= 2) {
                System.out.print(" " + Backward);
            }
    }
}