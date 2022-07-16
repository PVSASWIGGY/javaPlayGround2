package com.ultralesson.javaPlayGround;

import java.util.ArrayList;

public class ArraySumAndProduct {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(4);
        a.add(8);
        int sum=0,product=1;
        for(int i:a){
            sum+=i;
            product*=i;
        }
        System.out.println("Sum is "+sum);
        System.out.println("Product is "+product);
    }
}
