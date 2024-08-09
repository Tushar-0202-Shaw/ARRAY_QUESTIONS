package Arrays_Questions;
import java.util.Scanner;
public class Array_17_Alternate_Method {
    public static void make_Prefix_Array(int[]array){
        int n = array.length;
        for(int i=1;i<n;i++){
            array[i] += array[i-1];
        }
    }
    public static void PrintArray(int[]array){
        for(int i: array){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[]array = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Original Array");
        PrintArray(array);
        make_Prefix_Array(array);
        System.out.println("Required Array");
        PrintArray(array);
    }
}