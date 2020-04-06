package com.company;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        short[] ali = new short[101];
        short value = 100;

        for (int i = 0; i <= 100; i++, value--) {
            ali[i] = value;
            System.out.print(" " + ali[i]);
        }

        short ali_min = 0;
        int sum1 = 0;
        for (short i = 0; i < ali.length; i++) {
            sum1 += ali[i];
            if (ali[i] < ali_min)
                ali_min = ali[i];
        }
        System.out.print("\n " + ali_min);

        Arrays.sort(ali);
        short ali_max = ali[ali.length - 1];
        System.out.println("\n " + ali_max);

        sum1 = sum1 - ali_max - ali_min;
        System.out.println("\n " + sum1);
    }
}