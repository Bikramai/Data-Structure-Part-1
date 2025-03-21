package com.bikram;
public class Main {
    public static void main(String[] names) {
        // O(1) space
        String[] copy = new String[names.length];
        for (int i = 0; i < names.length; i++)
            System.out.println("Hi " + names[i]);
    }
}

