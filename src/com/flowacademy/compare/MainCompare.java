package com.flowacademy.compare;

public class MainCompare {
    public static void main(String[] args) {
        String s1 = "kutya";
        String s2 = "kutya";
        String s3 = s1;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
