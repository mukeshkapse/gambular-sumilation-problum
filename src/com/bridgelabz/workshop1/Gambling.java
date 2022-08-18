package com.bridgelabz.workshop1;

public class Gambling {
   static int stack = 100;
   static int bet = 1;
   static int win = 1;
    static int stack50loss = stack/2;
    static int stack150win = stack+stack50loss;
    public static void main(String[] args) {
        System.out.println("Welcome to the Gabling");
        while(stack >stack50loss && stack < stack150win){
            int bit = (int) (Math.random() * (2) + 1);
        if (bit == win) {
            System.out.println("You Are Win");
            stack++;
        } else {
            System.out.println("You Are Loss");
            stack--;
        }
    }
        if(stack==stack50loss)
        {
            System.out.println("You are Loss 50% and your Stack is  " + stack);
        }else
        {
            System.out.println("You Are Win 50% Stack And Your Stack is  "+stack);
        }
    }
}