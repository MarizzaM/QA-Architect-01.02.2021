package com.company;

public class Main {

    public static void main(String[] args) {

        createMeals();
    }

    static void createMeals (){
        Meal spicyTuna = new Meal("Spicy Tuna Roll", false, 42);
        Meal salmonLime = new Meal("Salmon Lime Roll", false, 48);
    }
}
