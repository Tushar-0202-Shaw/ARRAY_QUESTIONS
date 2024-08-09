package Arrays_Questions;
import java.util.Scanner;
public class Array_12_Rotate_An_Array {
    public static int[] rotate(int[]array, int k){
        int n = array.length;
        int[] ans = new int[n];
        int j = 0;
        k = k%n;
        for(int i=n-k;i<n;i++){
            ans[j++] = array[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++] = array[i];
        }
        return ans ;
    }
    public static void printArray(int[]array){
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
        System.out.println("Enter "+n+" elements :-");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Enter how many times you want to rotate the array :- ");
        int k = sc.nextInt();
        System.out.println("Original array");
        printArray(array);
        int[]ans = rotate(array,k);
        System.out.println("Array after rotation");
        printArray(ans);
    }
}