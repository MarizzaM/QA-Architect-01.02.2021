package com.company;

public class Main {

    public static void main(String[] args) {

        createDog();

    }

    static void createDog (){
        Dog hachiko = new Dog();
        hachiko.name = "Hachikō";
        hachiko.age = 2;
        hachiko.brand = "Akita";
        hachiko.bark();
        System.out.println(hachiko);
    }
}
