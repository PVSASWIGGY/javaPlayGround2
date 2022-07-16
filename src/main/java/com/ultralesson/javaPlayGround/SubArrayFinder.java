package com.ultralesson.javaPlayGround;

import java.util.Arrays;

public class SubArrayFinder {
    public static void main(String[] args) {
        int[] a={10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        System.out.println(Arrays.toString(Arrays.copyOfRange(a,3,9)));
    }
}
