package javabegginer;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter the first number for Multiplication: ");
        num1 = input.nextInt();
        System.out.println("Enter the last number for Multiplication: ");
        num2 = input.nextInt();
        for (int j=num1; j<=num2; j++){
            for (int i=1; i<=10; i++){
                System.out.println(j+" X "+i+" = "+j*i);
            }
            System.out.println("\n\n");
        }
    }
}
