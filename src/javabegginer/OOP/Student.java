package javabegginer.OOP;

public class Student {
    String name, gender;
    int number;
    Student (String a, String b, int c){
        name = a;
        gender = b;
        number = c;
    }

    Student(){
        System.out.println("No Value Added");
    }
    void display(){
        System.out.println("Student Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Number: "+number);
        System.out.println("\n");
    }
}
