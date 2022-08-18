package com.bridgelabz.workshop1;

public class Gambling {
   static int stack = 100;
   static int bet = 1;
   static int win = 1;
    public static void main(String[] args) {
        System.out.println("Welcome to the Gabling");

        int bit = (int) (Math.random() * (2) + 1);
        if (bit == win) {
            System.out.println("You Are Win");
            stack++;
        } else {
            System.out.println("You Are Loss");
            stack--;
        }
        System.out.println("Stack is "+stack);

    }
}