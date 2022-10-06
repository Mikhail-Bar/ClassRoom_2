package com.company;

public class Ternary {
    public static void main(String[] args) {
        //Продажа табачных изделий до 18 лет запрещена
        int age = 18;
        String s = age<18 ? "Denied":"Legalize";
        System.out.println(s);
        System.out.println(age<18 ? "Denied":"Legalize");
        //Строчная или заглавная
        System.out.printf("%d, %d, %d, %d%n",(int)'a',(int)'z',(int)'A',(int)'Z');
        System.out.printf("%d, %d, %d, %d%n",(int)'а',(int)'я',(int)'А',(int)'Я');

        char ch = 'B';
        String answer = (int)ch>=97 && (int)ch<=122?"lowercase":
                (int)ch>=65 && (int)ch<=90?"uppercase": "Not a letter";
        System.out.println(answer);

        //Наибольшее из трех чисел
        int a = 1, b = 3, c = 2;
        //int max = a>b? b>c? a:a>c? a:c: a>c? b: b>c?b:c;
        int max  = a>b && a>c? a:
                   b>a && b>c? b:
                   c>a && c>b? c: 0;
        System.out.println(max);


    }
}
