package javabegginer;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,count = 0,totalprime = 0;
        System.out.print("Enter the initial number: ");
        a = input.nextInt();
        System.out.print("Enter the last number: ");
        b = input.nextInt();

        for(int i=a; i<=b; i++){
            for (int j=2; j<=i-1; j++){
                if (i%j == 0){
                    count++;
                    break;
                }
            }
            if (count == 0){
                totalprime++;
                System.out.println(i);
            }
            count = 0;
        }
        System.out.println("Total Prime Number: "+totalprime);
    }
}
