package Arrays_Questions;
import java.util.Scanner;
public class Kadanes_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter "+n+" elements :-");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int Current_Sum=0;
        int Max_Sum=Integer.MIN_VALUE;
        for(int element:arr) {
            Current_Sum += element;
            Max_Sum=Math.max(Current_Sum,Max_Sum);
            if(Current_Sum<0){
                Current_Sum=0;
            }
        }
        System.out.println("Result of the given input :- "+Max_Sum);
    }
}