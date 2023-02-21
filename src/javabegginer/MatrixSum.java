package javabegginer;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] A = new int[4][4];
        int [][] B = new int[4][4];
        int sum = 0;

        // taking input for matrix A
        System.out.println("Enter the matrix elements of A: ");
        for (int row=1; row<4; row++){
            for (int col=1; col<4; col++){
                System.out.printf("A[%d][%d] = ",row,col);
                A [row][col] = input.nextInt();
            }
        }

        //taking input for matrix B
        System.out.println("Enter the matrix elements of B: ");
        for (int row=1; row<4; row++){
            for (int col=1; col<4; col++){
                System.out.printf("B[%d][%d] = ",row,col);
                B [row][col] = input.nextInt();
            }
        }

        //printing the Output of A
        System.out.println("Matrix elements of A: ");
        for (int row=1; row<4; row++){
            for (int col=1; col<4; col++){
                System.out.print(A[row][col]+" ");
            }
            System.out.println("\n");
        }

        //Diagonal of matrix A
        System.out.println("Diagonal of matrix A: ");
        for (int row=1; row<4; row++){
            for (int col=1; col<4; col++){
                if (row == col){
                    System.out.print(" "+A[row][col]);
                    sum = sum + A[row][col];
                }
            }
        }
        System.out.println("\nSum of the Diagonal of A : "+sum);

        //upper triangle of matrix A and sum of them
        sum = 0;
        System.out.println("Upper Diagonal of matrix A: ");
        for (int row=1; row<4; row++){
            for (int col=1; col<4; col++){
                if (row < col){
                    System.out.print(" "+A[row][col]);
                    sum = sum + A[row][col];
                }
            }
        }
        System.out.println("\nSum of the Upper Diagonal of A : "+sum);

        // lower triangle of the matrix A and sum of them
        sum = 0;
        System.out.println("Upper Diagonal of matrix A: ");
        for (int row=1; row<4; row++){
            for (int col=1; col<4; col++){
                if (row > col){
                    System.out.print(" "+A[row][col]);
                    sum = sum + A[row][col];
                }
            }
        }
        System.out.println("\nSum of the Upper Diagonal of A : "+sum);

        //printing the Output of B
        System.out.println("Matrix elements of B: ");
        for (int row=1; row<4; row++){
            for (int col=1; col<4; col++){
                System.out.print(B[row][col]+" ");
            }
            System.out.println("\n");
        }

        //Diagonal of matrix B
        sum = 0;
        System.out.println("Diagonal of matrix B: ");
        for (int row=1; row<4; row++){
            for (int col=1; col<4; col++){
                if (row == col){
                    System.out.print(" "+B[row][col]);
                    sum = sum + B[row][col];
                }
            }
        }
        System.out.println("\nSum of the Diagonal of B : "+sum);

        //Upper triangle of matrix B and sum of them
        sum = 0;
        System.out.println("Upper Diagonal of matrix B: ");
        for (int row=1; row<4; row++){
            for (int col=1; col<4; col++){
                if (row < col){
                    System.out.print(" "+B[row][col]);
                    sum = sum + B[row][col];
                }
            }
        }
        System.out.println("\nSum of the Upper Diagonal of B : "+sum);

        //lower triangle of matrix B and sum of them
        sum = 0;
        System.out.println("Upper Diagonal of matrix B: ");
        for (int row=1; row<4; row++){
            for (int col=1; col<4; col++){
                if (row > col){
                    System.out.print(" "+B[row][col]);
                    sum = sum + B[row][col];
                }
            }
        }
        System.out.println("\nSum of the Upper Diagonal of B : "+sum);

        // sum of the matrices
        sum =0;
        System.out.println("Sum of the Matrices: ");
        for (int row=1; row<4; row++){
            for (int col=1; col<4; col++){
                sum = sum + A[row][col]+B[row][col];
                System.out.print(sum+" ");
                sum = 0;
            }
            System.out.println("\n");
        }

        //multiplication of the matrices
        int [][] C = new int[4][4];
        sum = 0;
        for (int row=1; row<4; row++){
            for (int col=1; col<4; col++){
               for (int k=1; k<4; k++){
                   sum = sum +(A[row][k]*B[k][col]);
                   C[row][col] = sum;
               }
               sum = 0;
            }
            System.out.println("\n");
        }

        //printing the output of Multiplication
        System.out.println("Multiplication of the Matrices: ");
        for (int row=1; row<4; row++){
            for (int col=1; col<4; col++){
                System.out.print(C[row][col]+" ");
            }
            System.out.println("\n");
        }
    }
}
