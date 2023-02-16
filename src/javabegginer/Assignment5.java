package javabegginer;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Enter Your Age: ");
        age = input.nextInt();

        if(age>=18){
            System.out.println("You're a Valid Voter");
        }
        else {
            System.out.println("Invalid Voter");
        }
    }
}
