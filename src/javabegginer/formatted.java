package javabegginer;

import java.util.Scanner;

public class formatted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=====================");
        for (int i=0; i<3; i++){
            String ch = in.next();
            int num = in.nextInt();
            System.out.printf("%-15s %3d",ch,num);
        }
        System.out.println("\n=====================");
    }
}
