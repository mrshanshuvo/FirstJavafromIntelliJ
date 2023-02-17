package javabegginer;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,fibo = 0;
        System.out.print("Enter the last digit of the series: ");
        int last = input.nextInt();
        a = 0;
        b = 1;
        System.out.print(a+" "+b);
        for (int i=1; i<=last-2; i++){
            fibo = a+b;
            System.out.print(" "+fibo+" ");
            a = b;
            b = fibo;
        }
        System.out.println("\nWhich fibonacci number do you want see? ");
        int find = input.nextInt();
        a = 0;
        b = 1;
        for (int i=1; i<=find-2; i++){
            fibo = a+b;
            a = b;
            b = fibo;
        }
        System.out.println(fibo);
    }
}
