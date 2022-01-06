package com.codedifferently.labs.lab09.part_b.examples;

import java.util.Scanner;

public class Example01_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        String z = sc.next();
        sc.close();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
