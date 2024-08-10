package Arrays_Questions;
import java.util.Scanner;
public class Array_25_Pascal_Triangle {
    static void print_Array(int[][]array){
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] pascal(int n){
        int[][]ans = new int[n][];
        for(int i=0;i<n;i++){
            /*
            ith row has i+1 columns
            ans[0] = new int[1]
            ans[1] = new int[2]
            ...
            ans[4] = new int[3]
             */
            ans[i] = new int[i+1];
            //the first and last element of each row is 1
            ans[i][0] = ans[i][i] = 1;
            for(int j=1;j<i;j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows you want to print :- ");
        int n = sc.nextInt();
        int[][]ans = pascal(n);
        print_Array(ans);
    }
}