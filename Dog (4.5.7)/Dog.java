package com.company;

public class Dog {
    public String name;
    public int age;
    public String brand;

    public void bark(){
        System.out.println(String.format("%s tells you: woof, woof", name));
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", brand='" + brand + '\'' +
                '}';
    }
}
