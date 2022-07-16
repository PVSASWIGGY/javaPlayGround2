package com.ultralesson.javaPlayGround;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> a=new ArrayList<>();
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        System.out.println("Max value is "+Math.max(Math.max(a.get(0),a.get(2)), a.get(1)));
        System.out.println("Min value is "+Math.min(Math.min(a.get(0),a.get(2)), a.get(1)));
    }
}
