package javabegginer.String;

public class BasicString {
    public static void main(String[] args) {
        // different ways to take strings
        String str1 = "My name is";
        String str2 = new String(" Shahid Hasan Shuvo");
        char [] str3 = {'S','h','a','n'};

        // output of the strings
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // comparing the strings
        boolean result = str1.equals(str2);
        System.out.println("str1 is equal to str2: "+result);

        // checking availability of 'is'
        boolean compare = str1.contains("is");
        System.out.println("'is' is there in str1: "+compare);

        // checking the string
        boolean empty = str2.isEmpty();
        System.out.println("str2 is empty: "+empty);

        // finding the length of the string
        int len = str3.length;
        System.out.println("The length of str3 : "+len);

        // adding two string
        String str4 = str1 + str2;
        System.out.println(str4);

        // adding two string by concat
        String str5 = str1.concat(str2);
        System.out.println(str5);

        // making uppercase from any case
        String uppercase = str5.toUpperCase();
        System.out.println(uppercase);

        // making lowercase from any case
        String lowercase = str5.toLowerCase();
        System.out.println(lowercase);

        // checking the starting word or letter
        boolean start = str5.startsWith("My");
        System.out.println("str5 starts with 'my': "+start);

        // checking the ending word or letter
        boolean end = str5.endsWith("shuvo");
        System.out.println("str5 ends with 'shuvo': "+end);

        // replacing letter with letter
        String replace = str5.replace('S','Z');
        System.out.println("After replacing S with Z: "+replace);

        // splitting a string into pieces
        String [] split = str5.split(" ");
        for (String x: split){
            System.out.println(x);
        }

    }
}
