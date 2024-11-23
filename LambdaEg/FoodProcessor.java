package org.example.LambdaEg;

public interface FoodProcessor <T,U>{

    U process(T t); // takes aloo T to make samosa U

}
