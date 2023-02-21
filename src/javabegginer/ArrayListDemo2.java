package javabegginer;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList <Integer> num1= new ArrayList<Integer>();
        ArrayList <Integer> num2 = new ArrayList<Integer>();
        ArrayList <Integer> num3 = new ArrayList<Integer>();

        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);
        num1.add(50);

        System.out.print("ArrayList: ");
        for (int x: num1){
            System.out.print(x+" ");
        }
        //checking the arraylist is empty or not
        boolean check = num1.isEmpty();
        System.out.println("\nThe array is empty: "+check);

        //checking elements is present or not
        boolean find = num1.contains(40);
        System.out.println("The number is here: "+find);

        //finding the index of an element
        int index = num1.indexOf(50);
        System.out.println("The index of 50 : "+index);

        //finding the number of an index
        int number = num1.get(2);
        System.out.println("The number at index 2 is: "+number);

        num2.add(1);
        num2.add(2);
        num2.add(4);
        num2.add(3);
        num2.add(5);

        System.out.print("ArrayList 2: ");
        for (int x: num2){
            System.out.print(x+" ");
        }

        System.out.println("\n");
        num3.addAll(num2);
        System.out.print("ArrayList 3: ");
        for (int x: num3){
            System.out.print(x+" ");
        }

        boolean result = num1.equals(num2);
        System.out.println("\nList 1 is equal to list 2 : "+result);

        boolean res = num2.equals(num3);
        System.out.println("\nList 2 is equal to list 3 : "+res);

    }
}
