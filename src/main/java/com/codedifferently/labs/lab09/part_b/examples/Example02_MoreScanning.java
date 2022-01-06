package com.codedifferently.labs.lab09.part_b.examples;

import java.util.Scanner;

public class Example02_MoreScanning {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("You have entered the string: "+ str);
        System.out.println("You have entered the integer: "+ num);

    }
}
