package com.bikram;

import java.util.Arrays;

public class Main {
    public static void main(String[] names) {
        Array numbers = new Array(5);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);
        numbers.insert(70);
        numbers.removeAt(6);
        numbers.print();
        System.out.println(numbers.indexOf(10));
    }
}

