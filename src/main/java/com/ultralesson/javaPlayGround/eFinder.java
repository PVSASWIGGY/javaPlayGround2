package com.ultralesson.javaPlayGround;

public class eFinder {
    public static void main(String[] args) {
        String s="Umbrella";
        for(char i:s.toCharArray()){
            if(i=='e' || i=='E'){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
