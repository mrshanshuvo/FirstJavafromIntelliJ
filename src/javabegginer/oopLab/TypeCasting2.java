package javabegginer.oopLab;

public class TypeCasting2 {
    public static void main(String[] args) {

        // string to int
        String num = "23";
        int number = Integer.valueOf(num);
        System.out.println(number);

        // string to double
        String num1 = "23.32";
        double number1 = Double.valueOf(num1);
        System.out.println(number1);

        // string to char
        String num2 = "h";
        char ch = num2.charAt(0);
        System.out.println(ch);

        // string to boolean
        String  num3 = "true";
        boolean chh = Boolean.parseBoolean(num3);
        System.out.println(chh);

    }
}
