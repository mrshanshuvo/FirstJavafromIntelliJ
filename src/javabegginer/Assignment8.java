package javabegginer;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch1,ch2;
        System.out.print("Have you completed your masters? (y/n) : ");
        ch1 = input.next().charAt(0);
        System.out.print("Are you fluent in English? (y/n) : ");
        ch2 = input.next().charAt(0);

        if (ch1 == 'y' && ch2 == 'y'){
            System.out.print("You are eligible for the job interview");
        }
        else {
            System.out.print("You're not eligible for the job interview");
        }
    }
}
