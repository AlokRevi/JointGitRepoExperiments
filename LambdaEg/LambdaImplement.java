package org.example.LambdaEg;

import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaImplement {


    private static java.util.function.Predicate<? super String> Predicate;

    public static void main(String[] args) {

        Eat eat = () -> "Lambda Ice cream"; //no parameters implementation

        Eat2 eat2 = (X, Y) -> Math.random() > 0.5 ? X : Y;// Implementation of method // 2 parameter

        System.out.println("Lambda Outcome : " + eat2.blah("Chelsea", "Liverpool"));// calling the method

        Eat3 eat3 = n -> System.out.println("working with " + n);// Implementation of method


        List<String> abc = Arrays.asList("A", "B", "C", "D", "E");
        ArrayList<String> abcArray = new ArrayList<>(abc);

        System.out.println(abcArray);
        /*abc.sort((s1, s2) -> s1.compareTo(s2));
        abc.removeIf(Predicate);
        System.out.println(abc);
    }*/

       /* EatGeneric eatGeneric = (item) -> System.out.println("Print " + item);// Implementation
        System.out.println("Lambda Generic Outcome : " + eatGeneric.print(item));*/

     /*           Printer<String> pr = t-> System.out.println(t);
        pr.print("Hello World");*/


        FoodProcessor<String, Double> fp = n -> Double.parseDouble(n);
        Double d = fp.process("potato");
        System.out.println(d);

    }
}




