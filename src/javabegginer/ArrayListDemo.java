package javabegginer;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //creating arrayList
        ArrayList <Integer> number = new ArrayList<Integer>();

        //measuring the size of the arrayList
        System.out.println("Size of ArrayList: "+number.size());

        // adding numbers into the arrayList
        System.out.println("Elements are: ");
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(3,34);

        for (int x: number){
            System.out.println(x+" ");
        }

        //measuring the size of the arrayList
        System.out.println("Size of ArrayList: "+number.size());

        //removing from the arrayList
        number.remove(3);

        //after removing element
        for (int x: number){
            System.out.println(x+" ");
        }

        //measuring the size of the arrayList
        System.out.println("After removing one element,Size of ArrayList: "+number.size());

        //remove all the elements
        number.removeAll(number);

        //measuring the size of the arrayList
        System.out.println("After removing all elements, Size of ArrayList: "+number.size());
    }
}
