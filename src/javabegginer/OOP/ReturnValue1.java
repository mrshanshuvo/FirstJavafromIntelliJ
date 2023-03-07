package javabegginer.OOP;

public class ReturnValue1 {
    public static void main(String[] args) {
        ReturnValue ob1 = new ReturnValue();
        int result = ob1.value(5);
        System.out.println("Result is: "+result);

        ReturnValue ob2 = new ReturnValue();
        System.out.println("Result is: "+ob2.value(7));
    }
}
