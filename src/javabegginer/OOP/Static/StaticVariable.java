package javabegginer.OOP.Static;

public class StaticVariable {
    String name;
    int id;
    static String unName = "Green University of Bangladesh";

    StaticVariable(String n, int m){
        name = n;
        id = m;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("University Name : "+unName);
    }
}
