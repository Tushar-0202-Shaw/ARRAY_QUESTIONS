package Arrays_Questions;
import java.util.*;
public class Array_5_Check_Whether_An_Array_Is_Sorted_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int n = sc.nextInt();
        int[]array = new int [n];
        System.out.println("Enter elements of array :-");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        boolean R = true ;
        for(int i=0;i<n-1;i++){
            if (array[i] > array[i+1]) {
                R = false;
                break;
            }
        }
        if(R){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}