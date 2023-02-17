package javabegginer;

import java.util.Scanner;

public class conditionalStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,large,small;
        System.out.println("Enter the first number: ");
        num1 = input.nextInt();
        System.out.println("Enter the Second number: ");
        num2 = input.nextInt();

        large = (num1>num2) ? num1 : num2;
        System.out.println("Large number is : "+large);
        small = (num1<num2) ? num1 : num2;
        System.out.println("Smaller number is : "+small);
    }
}
