package javabegginer.Inheritance;

public class Student extends Person{
    String dept;

    void display2(){
        display1();
        System.out.println("Department: "+dept);
    }
}
