package javabegginer.String;

import java.util.Scanner;

public class StringBuilder {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        java.lang.StringBuilder ch = new java.lang.StringBuilder();

        System.out.println("Enter a String  :");
        ch.append(in.nextLine());

        String b = ch.toString();
        System.out.println("Before Reverse : ");
        System.out.println(b);
        ch.reverse();
        System.out.println("After Reverse : ");
        String c = ch.toString();
        System.out.println(c);

        if (b.equals(c)){
            System.out.println(b+" is a palindrome word : "+b.equals(c));
        }
        else System.out.println(b+" is a palindrome word : "+b.equals(c));

    }
}
