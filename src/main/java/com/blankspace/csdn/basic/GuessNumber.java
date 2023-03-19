package com.blankspace.csdn.basic;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        System.out.println("Hello, what's your name?");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        Random random = new Random();
        System.out.println("Hi, " + name + ". Nice to meet you. ");
        while (true) {
            System.out.println("Let's play a game. I hold a number between 100 and 999, can you guess what is it?");
            int num = random.nextInt(900) + 100;
            String flag;
            while (true) {
                int guess = in.nextInt();
                if (guess > num) {
                    System.out.println("Higher!");
                } else if (guess < num) {
                    System.out.println("Lower!");
                } else {
                    System.out.println("Correct! Congratulation!");
                    break;
                }
                do {
                    System.out.println("Do you want to contitue?(Y/N)");
                    flag = in.next();
                    if (flag.equalsIgnoreCase("Y")) {
                        System.out.println("Try again!");
                    } else if (!flag.equalsIgnoreCase("N")) {
                        System.out.println("Sorry I can not understand.");
                    }
                } while (!flag.equalsIgnoreCase("N") && !flag.equalsIgnoreCase("Y"));
                if (flag.equalsIgnoreCase("N")) {
                    break;
                }
            }
            do {
                System.out.println("Do you want to contitue to play?(Y/N)");
                flag = in.next();
                if (!flag.equalsIgnoreCase("N") && !flag.equalsIgnoreCase("Y")) {
                    System.out.println("Sorry I can not understand.");
                }
            } while (!flag.equalsIgnoreCase("N") && !flag.equalsIgnoreCase("Y"));

            if (flag.equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("Bye! Have a nice day!");
    }

}
