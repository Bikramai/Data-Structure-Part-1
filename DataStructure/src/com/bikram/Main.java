package com.bikram;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] names) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.remove(0);
        list.indexOf(20);
        list.lastIndexOf(20);
        list.contains(20);
        list.size();
        list.toArray();
        System.out.println(list);
    }
}

