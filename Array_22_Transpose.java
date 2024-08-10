package Arrays_Questions;
import java.util.Scanner;
public class Array_22_Transpose {
    static void print_array(int[][]array){
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][]array,int r,int c){
        int[][]transpose = new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                transpose[i][j] = array[j][i];
            }
        }
        return transpose;
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
        System.out.println("Given Matrix :-");
        print_array(array);
        System.out.println("Transpose of the given matrix :-");
        int[][]transpose = findTranspose(array,r,c);
        print_array(transpose);
    }
}