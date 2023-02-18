package javabegginer;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sum = 0, temp, rem;

        System.out.println("Enter any number to check whether it is Armstrong or not: ");
        num = in.nextInt();

        temp = num;
        while (temp != 0){
            rem = temp % 10;
            sum = sum + rem*rem*rem;
            temp = temp / 10;
        }
        if (num == sum){
            System.out.println("Given number is Armstrong");
        }
        else {
            System.out.println("Given number is not Armstrong");
        }
    }
}
