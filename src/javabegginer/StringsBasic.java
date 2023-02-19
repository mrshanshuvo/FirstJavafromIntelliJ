package javabegginer;

public class StringsBasic {
    public static void main(String[] args) {
        String [] name = {"My","name","is","Shahid"};

        //for each loop

        System.out.println("\n");
        for (String x: name){
            System.out.print(" "+x);
        }

        System.out.println("\n");
        int sum = 0;
        int [] number = {1,2,3,4,5,6,7,8,9,10};
        for (int x : number){
            sum = sum + x;
            System.out.print(" "+x);
        }
        System.out.print("\nSummation of the given numbers: "+sum);
    }
}
