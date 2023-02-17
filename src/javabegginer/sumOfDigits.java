package javabegginer;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,sum = 0,temp,rem;
        System.out.println("Enter any Digit: ");
        num = in.nextInt();
        temp = num;
        while (temp != 0){
            rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }
        System.out.println("Summation of the Digits : "+sum);
    }
}
