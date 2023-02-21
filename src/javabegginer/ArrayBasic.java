package javabegginer;
public class ArrayBasic {
    public static void main(String[] args) {

        int [][] arr = new int[4][5];
        int k = 0;

        for (int i=0; i<4; i++){
            for (int j=0; j<5; j++){
                arr [i][j] = k;
                k++;
            }
        }
        //printing the array

        for (int i=0; i<4; i++){
            for (int j=0; j<5; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }

    }
}
