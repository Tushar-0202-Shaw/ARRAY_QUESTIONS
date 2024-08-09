package Arrays_Questions;
import java.util.Scanner;
public class Array_15_Odd_Integer_Followed_By_Even_Integer {
    public static void swap(int[]array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void SortEvenAndOdd(int[]array){
        int n = array.length;
        int left=0 , right=n-1;
        while(left<right){
            if(array[left]%2!=0 && array[right]%2==0){
                swap(array,left,right);
                left++;
                right--;
            }
            if(array[left]%2==0){
                left++;
            }
            if(array[right]%2!=0){
                right--;
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
        System.out.println("Enter "+n+" elements :-");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Original array :-");
        PrintArray(array);
        SortEvenAndOdd(array);
        System.out.println("Required array :-");
        PrintArray(array);
    }
}