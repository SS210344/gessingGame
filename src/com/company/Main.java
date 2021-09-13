package com.company;

import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number;
        number  = random.nextInt(100);
        int guesses = 0;
        while (guesses <10) {
            System.out.println("guess a number between 1 and 100:");
            int guess = input.nextInt();
            int wamth = Math.abs(number-guess);
            if (guess == number) {
                break;
            }
            if (wamth <= 5) {
                System.out.println("hot");
            }
            else if (wamth <= 15) {
                System.out.println("warm");
            } else{
                System.out.println("cold");
            }
            guesses++;
        }
        System.out.println("number of guesses:"+guesses);
        if (guesses < 10){
            System.out.println("you win!");
        } else{
            System.out.println("you lose");
        }







    }
}
