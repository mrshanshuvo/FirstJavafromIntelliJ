import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter any integer number: ");
        num = in.nextInt();

        //decimal to binary
        String binary;
        binary = Integer.toBinaryString(num);
        System.out.println(binary);

        // decimal to octal
        String octal;
        octal = Integer.toOctalString(num);
        System.out.println(octal);

        //decimal to hexadecimal
        String hexadecimal;
        hexadecimal = Integer.toHexString(num);
        System.out.println(hexadecimal);
    }
}