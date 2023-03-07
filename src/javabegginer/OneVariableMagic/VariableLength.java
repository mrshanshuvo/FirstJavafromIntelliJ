package javabegginer.OneVariableMagic;

public class VariableLength {
    void Sum (int ... num){
        int sum = 0;
        for(int x : num){
            sum = sum + x;
        }
        System.out.println("Summation is: "+sum);
    }
}
