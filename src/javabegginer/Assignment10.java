package javabegginer;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        for (int i=1; i<=10; i++){
            sum+=i;
        }
        System.out.println("Summation of 1-10 : "+sum);
    }
}
