package Arrays_Questions;
import java.util.Scanner;
public class Array_26_Spiral_Order_Of_A_Matrix {
    public static void printArray(int[][]array){
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void spiralOrder(int[][]array , int r ,int c){
        int topRow = 0 , bottomRow = r-1 , leftCol = 0 , rightCol = c-1;
        int total_elements = 0;
        while(total_elements<(r*c)){
            //topRow -> leftCol to rightCol
            for(int j=leftCol ; j<=rightCol && total_elements<(r*c) ; j++){
                System.out.print(array[topRow][j]+" ");
                total_elements++;
            }
            topRow++;
            //rightCol -> topRow to bottomRow
            for(int i=topRow ; i<=bottomRow && total_elements<(r*c) ; i++){
                System.out.print(array[i][rightCol]+" ");
                total_elements++;
            }
            rightCol--;
            //bottomRow -> rightCol to leftCol
            for(int j=rightCol ; j>=leftCol && total_elements<(r*c) ; j--){
                System.out.print(array[bottomRow][j]+" ");
                total_elements++;
            }
            bottomRow--;
            //leftCol -> bottomRow to topRow
            for(int i=bottomRow ; i>=topRow && total_elements<(r*c) ; i--){
                System.out.print(array[i][leftCol]+" ");
                total_elements++;
            }
            leftCol++;
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
        System.out.println("Given Matrix :-");
        printArray(array);
        System.out.println("Spiral Order :-");
        spiralOrder(array,r,c);
    }
}