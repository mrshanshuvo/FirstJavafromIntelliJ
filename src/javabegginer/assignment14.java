package javabegginer;

import java.util.Scanner;

public class assignment14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, n, rem, temp, sum = 0, count = 0;
        System.out.print("Enter the Starting Number: ");
        m = in.nextInt();
        System.out.print("Enter the Last Number: ");
        n = in.nextInt();

        System.out.println("\nArmstrong numbers are: ");
        for (int i=m; i<=n; i++){
            temp = i;
            sum = 0;
            while (temp != 0){
                rem = temp % 10;
                sum = sum + rem * rem * rem;
                temp = temp / 10;
            }
            if (i == sum){
                System.out.println(sum);
                count ++;
            }
        }
        System.out.println("\nTotal Armstrong numbers are: "+count);
    }
}
