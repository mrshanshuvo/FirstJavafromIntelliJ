package javabegginer;

import java.util.Scanner;

public class sumofseries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = 5,n = 10,sum=0;
        for (int i=m; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Summation is : "+sum);

    }
}
