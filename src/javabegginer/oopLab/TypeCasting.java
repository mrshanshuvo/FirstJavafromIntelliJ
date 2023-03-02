package javabegginer.oopLab;

public class TypeCasting {
    public static void main(String[] args) {
        int num1;
        double num2;
        char ch;
        boolean bool;
        num1 = 23;
        num2 = 234;
        ch = 'a';
        bool = false;

        // type casting / conversion
        // int to string
        String str1 = Integer.toString(num1);
        System.out.println(str1);

        // double to string
        String str2 = Double.toString(num2);
        System.out.println(str2);

        // char to string
        String str3 = Character.toString(ch);
        System.out.println(str3);

        // boolean to string
        String str4 = Boolean.toString(bool);
        System.out.println(str4);
    }
}
