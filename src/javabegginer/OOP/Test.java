package javabegginer.OOP;

public class Test {
    public static void main(String[] args) {
        // creating an object
        Teacher teacher1 = new Teacher();
        teacher1.name = "Shahid Hasan Shuvo";
        teacher1.gender = "Male";
        teacher1.age = 24;
        teacher1.display(); // for printing output

        // creating 2nd object
        Teacher teacher2 = new Teacher();
        teacher2.name = "Zahid Hasan Joy";
        teacher2.gender = "Male";
        teacher2.age = 23;
        teacher2.display();

        // creating 3rd object
        // taking input using method
        Teacher teacher3 = new Teacher();
        teacher3.setInput("Nijhum Khaer","Girl",22);
        teacher3.display();
    }
}
