package com.ultralesson.javaPlayGround;

import java.util.Scanner;

public class ProductFinder {
    public static void main(String[] args) {
        ProductFinder pf=new ProductFinder();
        Scanner sc=new Scanner(System.in);
        int number1= sc.nextInt();
        int number2= sc.nextInt();
        System.out.println(pf.product(number1,number2));
    }
    public int product(int a,int b){
        return a*b;
    }
}
