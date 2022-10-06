package com.company;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x1 ="";
        int x2;


        while (true){

        int a = (int) (Math.random()*3+1);

        switch (a){
            case 1: x1="Stone";
                    break;
            case 2: x1="Paper";
                    break;
            case 3: x1="Scissor";
            }


        System.out.println("1 - Stone , 2 - Paper, 3 - Scissor");
        System.out.print("Enter num: ");
        x2 = scanner.nextInt();

            System.out.printf("My choice - %s\n", x1);

        if (a == x2)
            System.out.println("Draw");
        else if((a == 1 && x2 == 3 )|| (a == 2 && x2 == 1 )|| (a == 3 && x2 == 2))
            System.out.println("You lose");
        else
           System.out.println("You won");



        }
    }
}
