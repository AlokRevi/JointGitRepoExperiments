package org.example.Predicate;
/*Use Predicate<Integer> to filter out the even numbers.
Use Function<Integer, Integer> to square the numbers.
Use reduce() to calculate the sum of the squares.*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateImplementation {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);

        System.out.println(list);


        // Employee employee = n-> n>=10;
        Predicate<Integer> p = n -> n % 2 == 0;
        // p stores a boolean value
        // test is a method inside the Predicate interface

        int squares;
        int sumOfSquares;

        for (int element : list) {
            if (p.test(element)) {
                //  System.out.println(element);// sorted even numbers


                Function<Integer, Integer> f = (a) -> a * a;
                // f stores an integer value

                System.out.println(f.apply(element));
                //squares the even elements

                squares = f.apply(element);

                sumOfSquares=f



            }
        }



    }
}

