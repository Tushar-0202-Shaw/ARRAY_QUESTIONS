package Arrays_Questions;
import java.util.Scanner;
public class Array_20_Multiplication_Of_Matrices {
    static void print_matrix(int[][]array){
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void multiply(int[][]array1 , int r1 , int c1 , int[][]array2 , int r2 , int c2){
        if(c1 != r2){
            System.out.println("Multiplication not possible - Wrong dimension");
            return;
        }
        int[][]mul = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mul[i][j] += (array1[i][k]*array2[k][j]);
                }
            }
        }
        System.out.println("Multiplication of the given two matrices :- ");
        print_matrix(mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows for 1st array");
        int r1 = sc.nextInt();
        System.out.println("enter number of columns for 1st array");
        int c1 = sc.nextInt();
        int[][]array1 = new int[r1][c1];
        System.out.println("Enter "+(r1*c1)+" elements in 1st array");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("First matrix :-");
        print_matrix(array1);
        System.out.println("enter number of rows for 2nd array");
        int r2 = sc.nextInt();
        System.out.println("enter number of columns for 2nd array");
        int c2 = sc.nextInt();
        int[][]array2 = new int[r2][c2];
        System.out.println("Enter "+(r2*c2)+" elements in 2nd array");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                array2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Second matrix");
        print_matrix(array2);
        multiply(array1,r1,c1,array2,r2,c2);
    }
}