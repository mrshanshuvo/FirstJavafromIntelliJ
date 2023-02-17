package javabegginer;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5;
        int factorial = 1;
        for (int i=1; i<=num; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of 10 is : "+factorial);
    }
}
