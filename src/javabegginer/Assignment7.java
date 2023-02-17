package javabegginer;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Do you love Java? (y/Y or n/N)= ");
        ch = input.next().charAt(0);

        if (ch == 'y' || ch == 'Y'){
            System.out.print("You are a Java Lover");
        } else if (ch == 'n' || ch == 'N') {
            System.out.print("You are not a Java Lover");
        }
        else {
            System.out.print("Invalid Choice");
        }
    }
}
