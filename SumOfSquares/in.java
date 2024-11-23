package org.example.SumOfSquares;
//Write a program that calculates the sum of the squares of all even numbers in a list.
import java.util.ArrayList;
import java.util.List;

public class in {

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

        int sumOfSquares=0;

        for(int element: list)
        { if((element%2)==0) {
            sumOfSquares=(element*element)+sumOfSquares;
        }
        }
        System.out.println("Sum of Squares of even numbers in the list is "+ sumOfSquares);
    }
}