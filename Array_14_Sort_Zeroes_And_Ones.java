package Arrays_Questions;
import java.util.Scanner;
public class Array_14_Sort_Zeroes_And_Ones {
    public static void SortZerosAndOnes(int[]array){
        int n = array.length;
        int count = 0;
        for(int i : array){
            if(i==0){
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<count){
                array[i]=0;
            }
            else{
                array[i]=1;
            }
        }
    }
    public static void PrintArray(int[]array){
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
        System.out.println("Enter "+n+" elements in 0's & 1's :- ");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Original Array :-");
        PrintArray(array);
        SortZerosAndOnes(array);
        System.out.println("Sorted Array :-");
        PrintArray(array);
    }
}