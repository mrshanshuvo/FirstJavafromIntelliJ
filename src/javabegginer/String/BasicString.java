package javabegginer.String;

public class BasicString {
    public static void main(String[] args) {
        String str1 = "My name is";
        String str2 = new String("Shahid Hasan Shuvo");
        char [] str3 = {'S','h','a','n'};

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        boolean result = str1.equals(str2);
        System.out.println("str1 is equal to str2: "+result);

        boolean compare = str1.contains("is");
        System.out.println("'is' is there in str1: "+compare);

        boolean empty = str2.isEmpty();
        System.out.println("str2 is empty: "+empty);

        int len = str3.length;
        System.out.println("The length of str3 : "+len);
    }
}
