package javabegginer.String;

public class PrimitiveWrapper {
    public static void main(String[] args) {
        // primitive data type to wrapper class
        int a = 5;
        Integer x = a;
        System.out.println("Int to Integer: "+x);
        double b = 4.34;
        Double y = b;
        System.out.println("double to Double: "+y);
        char c = 'd';
        Character z = c;
        System.out.println("char to Character: "+z);

        // primitive to string
        String str = Double.toString(b);
        System.out.println("Double to String: "+str);
        String str1 = Integer.toString(a);
        System.out.println("Integer to String: "+str1);

        // string to primitive
        String i = "32";
        int d = Integer.valueOf(i);
        System.out.println("string to integer: "+d);
        int f = Integer.parseInt(i);
        System.out.println("string to integer: "+f);
    }
}
