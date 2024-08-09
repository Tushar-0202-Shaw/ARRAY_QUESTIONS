package Arrays_Questions;
import java.util.Scanner;
public class Array_12_Without_Extra_Space {
    public static void swap(int[]array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void Reverse(int[]array,int i,int j){
        while(i < j){
            swap(array,i,j);
            i++;
            j--;
        }
    }
    public static void RotateInPlace(int[]array,int k){
        int n = array.length;
        k=k%n;
        Reverse(array,0,n-k-1);
        Reverse(array,n-k,n-1);
        Reverse(array,0,n-1);
    }
    public static void printArray(int[]array){
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
        System.out.println("Enter "+n+" elements :-");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter how many times you want to rotate the array");
        int k = sc.nextInt();
        System.out.println("Original array");
        printArray(array);
        RotateInPlace(array,k);
        System.out.println("Array after rotation");
        printArray(array);
    }
}