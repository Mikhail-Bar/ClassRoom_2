package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //Оценки по 5-бальной системе
        int mark = 4;

        switch (mark){
            case 1:
                System.out.println("Very Bad");
                break;
            case 2:
                System.out.println("Bad");
                break;
            case 3:
                System.out.println("Satisfactory");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Great");
                break;
            default:
                System.out.println("undefined");
        }

    }
}
