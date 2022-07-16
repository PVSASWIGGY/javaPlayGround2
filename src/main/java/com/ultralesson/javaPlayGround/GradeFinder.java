package com.ultralesson.javaPlayGround;

import java.util.Scanner;

public class GradeFinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        System.out.println(getGrade(marks));
    }

    private static String getGrade(int marks) {
        if(marks>=91){
            return "AA";
        } else if (marks>=81) {
            return "AB";
        } else if (marks>=71) {
            return "BB";
        } else if (marks>=61) {
            return "BC";
        } else if (marks>=51) {
            return "CD";
        } else if (marks>=41) {
            return "DD";
        }else{
            return "Fail";
        }
    }
}
