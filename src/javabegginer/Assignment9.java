package javabegginer;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        System.out.println("Enter Your Language Preference : \n1.Bengali\n2.Urdu\n3.Hindi\nSelect any random number for English\n");
        choice = scan.nextInt();
        switch (choice){
            case 1:
                System.out.println("Selected Language is Bengali");
                break;
            case 2:
                System.out.println("Selected Language is Urdu");
                break;
            case 3:
                System.out.println("Selected Language is Hindi");
                break;
            default:
                System.out.println("Selected Language is English");
        }
    }
}
