package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //method plays a game of rock paper scissors against computer
    public static void rpc(){
        String user;

        System.out.println("Instructions: choose one the following options of either rock, paper, or scissors. \n" +
                "Reminder: rock beats scissors, paper beats rock, scissor beats paper.");
        boolean b = true;

        //loops the game until user wins
        while(b) {
            System.out.println("Choose your weapon:");
            System.out.println("1. Rock\n" +
                    "2. Paper\n" +
                    "3. Scissors");

            //takes user input
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            int random = (int) (Math.random() * 3) + 1;

            if (choice == 1)
                System.out.println("You chose rock");
            else if (choice == 2)
                System.out.println("You chose paper");
            else if (choice == 3)
                System.out.println("You chose scissors");

            if (random == 1)
                System.out.println("Computer chose rock");
            else if (random == 2)
                System.out.println("Computer chose paper");
            else if (random == 3)
                System.out.println("Computer chose scissors");

            //compares the user's decision with computer's and finds out who the winner is
            if ((choice == 1 && random == 1) || (choice == 2 && random == 2) || (choice == 3 && random == 3))
                System.out.println("DRAW");
            else if ((choice == 1 && random == 3) || (choice == 2 && random == 1) || (choice == 3 && random == 2)) {
                System.out.println("YOU WIN");
                b = false;
                menu(); //sends user back to main menu
            }
            else if ((choice == 1 && random == 2) || (choice == 2 && random == 3) || (choice == 3 && random == 1))
                System.out.println("YOU LOSE");
        }
    }

    public static void guess(){
        //sets the random integer to guess
        int random = (int) ((Math.random()*9) + 1);
        boolean b = true;

        //loops game until user wins
        while(b) {
            System.out.println("Instructions: guess the correct number between 1 and 10.");
            System.out.println("Enter your guess: ");
            Scanner sc = new Scanner(System.in);
            int user = sc.nextInt();

            if (user == random) {
                System.out.println("YOU'RE GUESS IS CORRECT!!");
                b = false;
                menu(); //sends user back to menu
            }
            else
                System.out.println("YOU'RE GUESS IS WRONG");

        }
    }

    public static void calculate(){
        System.out.println("Instructions: enter 2 numbers and select the math operation you would like to implement");
        System.out.println("Enter first number: ");
        Scanner sc1 = new Scanner(System.in);
        double user1 = sc1.nextInt();
        System.out.println("Enter second number: ");
        Scanner sc2 = new Scanner(System.in);
        double user2 = sc2.nextInt();
        boolean b = true;

        //loops until user chooses to quit
        while(b) {
        double result = 0;
        System.out.println("1. add" +
                "\n2. subtract" +
                "\n3. multiply" +
                "\n4. divide" +
                "\n5. power" +
                "\n6. quit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

            //performs the calculations
            if (choice == 1)
                result = user1 + user2;
            else if (choice == 2)
                result = user1 - user2;
            else if (choice == 3)
                result = user1 * user2;
            else if (choice == 4)
                result = user1 / user2;
            else if (choice == 5)
                result = Math.pow(user1, user2);
            else if (choice == 6) {
                b = false;
                menu(); //sends the user back to main menu
            }
            else
                System.out.println("Please enter a valid value: ");

            System.out.println("You chose number " + choice);
            System.out.println("Result = " + result);
        }
    }

    public static void greater(){
        System.out.println("Instructions: enter 2 numbers and the program will tell u which one is greater");
        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int user1 = sc.nextInt();
        System.out.println("Enter second number: ");
        Scanner sc2 = new Scanner(System.in);
        int user2 = sc2.nextInt();

        if (user1 > user2) {
            System.out.println(user1 + " is the greater number");
            menu();
        }
        else {
            System.out.println(user2 + " is the greater number");
            menu();
        }
    }

    //displays menu screen
    public static void menu(){
        System.out.println("Select the game you want to play: " +
                "\n1. Rock Paper Scissors" +
                "\n2. Guess" +
                "\n3. Calculator" +
                "\n4. Greater" +
                "\n5. Quit");
    }
    public static void main(String[] args) {
	// write your code here
        menu();
        while(true) {
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            if (userChoice == 1)
                rpc();
            else if (userChoice == 2)
                guess();
            else if (userChoice == 3)
                calculate();
            else if (userChoice == 4)
                greater();
            else
                System.exit(0);
        }
    }
}
