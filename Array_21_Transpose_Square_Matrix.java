package Arrays_Questions;
import java.util.Scanner;
public class Array_21_Transpose_Square_Matrix {
    static void findTranspose(int[][]array,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }
    static void print_Array(int[][]array){
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of columns");
        int c = sc.nextInt();
        int[][]array = new int[r][c];
        System.out.println("Enter "+(r*c)+" elements :-");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Given matrix :-");
        print_Array(array);
        findTranspose(array,c,r);
        System.out.println("Transpose of the given matrix :-");
        print_Array(array);
    }
}