package com.company;

public class Memory {
    public static int intNumber;
    public static float floatNumber;
    public static String str;

    public static void add (int n){
        intNumber += n;
    }

    public static void add (float n){
        floatNumber += n;
    }

    public static void add (String s){
        str += s;
    }
}
