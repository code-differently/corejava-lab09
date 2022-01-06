package com.codedifferently.labs.lab09.part_b.examples;

import java.util.Scanner;

public class Example03_EvenMoreScanning {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
