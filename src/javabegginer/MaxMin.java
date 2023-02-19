package javabegginer;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] number = new int[5];

        System.out.println("Enter Different Numbers: ");
        for (int i=0; i<number.length; i++){
            number[i] = input.nextInt();
        }

        int max = number[0];
        int min = number[0];

        for (int i=0; i<number.length; i++){
            if (max < number[i]){
                max = number[i];
            }
        }

        for (int i=0; i<number.length; i++){
            if (min > number[i]){
                min = number[i];
            }
        }

        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);
    }
}
