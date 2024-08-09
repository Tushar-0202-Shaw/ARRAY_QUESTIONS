package Arrays_Questions;
import java.util.Scanner;
public class Array_17_Prefix_Sum_Array {
    static int[] makePrefixArray(int[]array){
        int n = array.length;
        int[]prefix = new int[n];
        prefix[0] = array[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+array[i];
        }
        return prefix;
    }
    static void printArray(int[]array){
        for(int i : array){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int n = sc.nextInt();
        int[]array = new int[n];
        System.out.println("Enter "+n+" elements :- ");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Original Array :-");
        printArray(array);
        int[]prefix = makePrefixArray(array);
        System.out.println("Required Array :-");
        printArray(prefix);
    }
}