package javabegginer;

import java.util.Scanner;

public class Assignemet6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter any number between 0-9 : ");
        num = input.nextInt();
        if (num == 1){
            System.out.println("One");
        }
        if (num == 2){
            System.out.println("Two");
        }
        if (num == 3){
            System.out.println("Three");
        }
        if (num == 4){
            System.out.println("Four");
        }
        if (num == 5){
            System.out.println("Five");
        }
        if (num == 6){
            System.out.println("Six");
        }
        if (num == 7){
            System.out.println("Seven");
        }
        if (num == 8){
            System.out.println("Eight");
        }
        if (num == 9){
            System.out.println("Nine");
        }
        else {
            System.out.println("Invalid Input");
        }

    }
}
