package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice();

        int i = 0;

        int roll1;
        int roll2;

        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        do {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;
            i++;

            System.out.printf("Roll %s: %s %s  Sum: %s\n", i, roll1, roll2, sum);

            if (sum == 2) {
                count2++;
            } else if (sum == 4) {
                count4++;
            } else if (sum == 6) {
                count6++;
            } else if (sum == 7) {
                count7++;
            }


        } while (i < 1000);

        System.out.println("Number of 2s "+count2);
        System.out.println("Number of 4s "+count4);
        System.out.println("Number of 6s "+count6);
        System.out.println("Number of 7s "+count7);


    }

}
