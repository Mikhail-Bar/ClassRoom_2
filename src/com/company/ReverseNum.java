package com.company;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 12345;
        String s = Integer.toString(n);

        for(int i=s.length()-1; i>=0; i--)
            System.out.print(s.charAt(i));
        System.out.println();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);


        while (n > 0 ){
            int dig = n%10;
            System.out.print(dig);
            n/=10;

        }

    }
}
