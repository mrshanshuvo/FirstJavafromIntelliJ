package javabegginer;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num = input.nextInt();
        for (int row=num; row>=1; row--){
            for (int col=1; col<=row; col++){
                String f1 = String.format("%c",64+col);
                System.out.print(" "+f1);
            }
            System.out.println("\n");
        }
    }
}
