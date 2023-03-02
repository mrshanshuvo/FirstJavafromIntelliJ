package javabegginer.OOP;
public class Teacher {
    String name, gender;
    int age;
    // method creation
    void setInput(String n,String m, int ag){
        name = n;
        gender = m;
        age = ag;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("\n");
    }
}
