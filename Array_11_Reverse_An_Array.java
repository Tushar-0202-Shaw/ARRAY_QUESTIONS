package Arrays_Questions;
import java.util.Scanner;
public class Array_11_Reverse_An_Array {
    static int[] ReverseArray(int[]array){
        int n = array.length;
        int[]ans = new int[n];
        int j = 0;
        for(int i=n-1;i>=0;i--){
            ans[j++] = array[i];
        }
        return ans ;
    }
    static void PrintArray(int[]array){
        for(int j : array){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int n = sc.nextInt();
        int[]array = new int[n];
        System.out.println("Enter "+n+" elements of array");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Given array :-");
        PrintArray(array);
        System.out.println("Reverse of the given array :-");
        int[]ans = ReverseArray(array);
        PrintArray(ans);
    }
}