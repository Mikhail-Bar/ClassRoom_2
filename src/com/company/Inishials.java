package com.company;

import java.util.Scanner;

public class Inishials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your First name: ");
        String first = scanner.nextLine();
        System.out.print("Input your Last name: ");
        String last = scanner.nextLine();
        System.out.printf("Your initials are: %c. %c. %n",first.charAt(0),last.charAt(0));

    }
}
