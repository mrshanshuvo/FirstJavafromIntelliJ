package javabegginer;

public class ArrayBasic2 {
    public static void main(String[] args) {

        int [][] arr = new int[4][5];
        int k = 0;

        for (int row=0; row<4; row++){
            for (int col=0; col<row+1; col++){
                arr[row][col] = k;
                k++;
            }
        }
        for (int i=0; i<4; i++){
            for (int j=0; j<i+1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
