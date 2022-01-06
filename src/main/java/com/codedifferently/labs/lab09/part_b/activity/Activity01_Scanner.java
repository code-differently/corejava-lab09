package com.codedifferently.labs.lab09.part_b.activity;

import java.util.Scanner;

public class Activity01_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String text = sc.next();
        int conversion = Integer.valueOf(text);
        conversion = conversion + 1;
        System.out.println("Your number increased by one is: " + conversion);
    }
}
