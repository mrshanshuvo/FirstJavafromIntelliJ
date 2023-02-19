package javabegginer;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[5];

        System.out.print("Enter different Numbers: ");
        for (int i=0; i<array.length; i++){
            array[i] = input.nextInt();
        }

        for (int i=0; i<array.length; i++){
            System.out.print("\nGiven Numbers are:  "+array[i]);
        }
        int sum = 0;
        for (int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("\nSummation of the numbers are: "+sum);
    }
}
