package org.example.LambdaEg.AmandAnmolProblem;

import java.util.Scanner;

public class FoodProcessor {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Potato, 2 Samosa, 3 Pizza");
        int choice = sc.nextInt();

        Potato selection = n -> {
            return switch (n = choice) {
                case 1 -> "Potato";
                case 2 -> "Samosa";
                case 3 -> "Pizza";
                default -> "Enter something sensible yo!";
            };
        };

        System.out.println(selection.mash(choice));

//        System.out.println(potato.mash(3));
//        System.out.println(potato.mash(1));

    }
}




