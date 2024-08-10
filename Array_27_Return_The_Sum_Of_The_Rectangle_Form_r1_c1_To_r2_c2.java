package Arrays_Questions;
import java.util.Scanner;
public class Array_27_Return_The_Sum_Of_The_Rectangle_Form_r1_c1_To_r2_c2 {
    public static int findSum(int[][]array,int r1,int c1,int r2,int c2){
        int sum = 0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum += array[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
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
        System.out.println("Enter r1");
        int r1 = sc.nextInt();
        System.out.println("Enter c1");
        int c1 = sc.nextInt();
        System.out.println("Enter r2");
        int r2 = sc.nextInt();
        System.out.println("Enter c2");
        int c2 = sc.nextInt();
        System.out.println("Required answer :- "+findSum(array,r1,c1,r2,c2));
    }
}