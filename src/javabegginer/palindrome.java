package javabegginer;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sum = 0, temp, rem;
        System.out.println("Enter any number: ");
        num = in.nextInt();

        temp = num;
        while (temp != 0){
            rem = temp % 10;
            sum = sum * 10 + rem;
            temp = temp / 10;
        }
        System.out.println(sum);
        if (num == sum){
            System.out.println("Given number is Palindrome");
        }
        else {
            System.out.println("Given number is not Palindrome");
        }
    }
}
