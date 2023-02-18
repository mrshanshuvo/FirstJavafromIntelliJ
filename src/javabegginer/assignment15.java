package javabegginer;

import java.util.Scanner;

public class assignment15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user, pass;
        int count = 0;

        do {
            System.out.print("Enter your user name : ");
            user = input.nextLine();
            System.out.print("Enter your user pass : ");
            pass = input.nextLine();

            if (user.equals("mr420") && pass.equals("12345")){
                System.out.println("Welcome to the System");
                count = 1;
            }else {
                System.out.println("Wrong Password or Username!!\nPlease try again!!");
            }
        } while (count == 0);

    }
}
