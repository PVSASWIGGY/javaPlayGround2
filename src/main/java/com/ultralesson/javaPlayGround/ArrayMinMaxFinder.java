package com.ultralesson.javaPlayGround;

import java.util.Arrays;

public class ArrayMinMaxFinder {
    public static void main(String[] args) {
        int[] a={10,20,5,57};
        System.out.println("Minimum value in array is "+Arrays.stream(a).min().getAsInt());
        System.out.println("Maximum value in array is"+Arrays.stream(a).max().getAsInt());
    }
}
