package Arrays_Questions;
import java.util.Scanner;
public class Array_24_Clockwise_Rotation {
    public static void printArray(int[][]array){
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][]array , int r , int c){
        int[][] ans = new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j] = array[j][i];
            }
        }
        return ans;
    }
    public static void reverse(int[]ans){
        int i=0 , j = ans.length-1;
        while(i<j){
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp ;
            i++;
            j--;
        }
    }
    public static void rotate(int[][]array , int r , int c){
        int[][]ans = transpose(array,r,c);
        for(int i=0 ;i<r;i++){
            reverse(ans[i]);
        }
        System.out.println("After rotating the matrix by 90 degrees , we get :-");
        printArray(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :- ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns :- ");
        int c = sc.nextInt();
        int[][]array = new int[r][c];
        System.out.println("Enter "+(r*c)+" elements :-");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix :-");
        printArray(array);
        rotate(array,r,c);
    }
}