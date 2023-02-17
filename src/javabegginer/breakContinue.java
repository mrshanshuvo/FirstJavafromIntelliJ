package javabegginer;

public class breakContinue {
    public static void main(String[] args) {
        System.out.println("Break Statements:");
        for (int i=1; i<=10; i++){
            if (i==5){
                break; //the loop will be stopped after the match
            }
            System.out.println(i);
        }
        System.out.println("Continue Statements: ");
        for (int i=1; i<=10; i++){
            if (i==5){
                continue; //only deletes that number and continue the loop
            }
            System.out.println(i);
        }
    }
}
