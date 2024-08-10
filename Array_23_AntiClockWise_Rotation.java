package Arrays_Questions;
import java.util.Scanner;
public class Array_23_AntiClockWise_Rotation {
    static void transpose(int[][]arr,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void rotate(int[][]arr,int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter "+(n*n)+" elements :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Given Matrix :-");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix after 90degree anti-clockwise rotation");
        transpose(matrix,n);
        rotate(matrix,n);
    }
}