package com.ultralesson.javaPlayGround;

import java.util.Scanner;

public class LowerCaseChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.next();
        while(input.length()!=1){
                System.out.println("enter only single character");
                input= sc.next();
            }
        char a=input.charAt(0);
        System.out.println(a >= 97 && a <= 122);
        }


}
