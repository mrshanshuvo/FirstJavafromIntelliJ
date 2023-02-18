package javabegginer;

import java.util.Scanner;

public class Assignement12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, n, temp, num=0, sum = 0, rem;
        System.out.println("Enter the Beginning number: ");
        m = in.nextInt();
        System.out.println("Enter the Ending number: ");
        n = in.nextInt();

        for (int i=m; i<=n; i++){
            temp = i;
            sum = 0;
            while (temp != 0){
                rem = temp % 10;
                sum = sum * 10 + rem;
                temp = temp / 10;
            }
            if (i == sum){
                System.out.println(sum);
                num ++;
            }
        }
        System.out.println("Total Palindrome numbers are: "+num);
    }
}
