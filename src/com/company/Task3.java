package com.company;

public class Task3 {
    public static void main(String[] args) {

        System.out.print("First variant" + "\n" );

       for (int Forward = 1; Forward <= 99; Forward += 2) {
                System.out.print(" " + Forward);
            }
        System.out.print(" \n");

       for (int Backward = 99; Backward >= 1; Backward -= 2) {
                System.out.print(" " + Backward);
            }
        System.out.print(" \n" + "Second variant"+ "\n" );

        for(int i = 1; i <= 99; i++ ) {
           if(i%2==1) {
               System.out.print(" " + i);
           }
       }
        System.out.print(" \n");

        for(int i = 99; i >= 1; i-- ) {
            if(i%2==1) {
                System.out.print(" " + i);
            }
        }
    }
}