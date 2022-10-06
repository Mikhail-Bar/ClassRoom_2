package com.company;

import java.util.Scanner;

public class SearchNum {
    public static void main(String[] args) {
        int a = (int)(Math.random()*100+1);
        int b = 0 ;

        Scanner scanner = new Scanner(System.in);

        while (a != b){
            System.out.print("Enter num: ");
            b = scanner.nextInt();
            if (b > a){
                System.out.println("Greater");

            }else if(b < a) {System.out.println("Less");}
            else System.out.println("You are right!");


        }

    }
}
