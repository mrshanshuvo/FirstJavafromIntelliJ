package javabegginer;

import java.util.Scanner;

public class areaOfTriangular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height,base,area;
        System.out.print("Enter the value of Height: ");
        height = input.nextDouble();
        System.out.print("Enter the value of Base: ");
        base = input.nextDouble();

        area = 0.5 * height * base;

        System.out.print("Area of the Triangle: "+area);
    }
}
