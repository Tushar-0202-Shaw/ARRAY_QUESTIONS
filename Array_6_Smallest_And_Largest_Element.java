package Arrays_Questions;
import java.util.*;
public class Array_6_Smallest_And_Largest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int n = sc.nextInt();
        int[]array = new int [n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int S = array[0];
        int L = 0 ;
        for(int i=0 ; i<n ;i++){
            if(array[i]<S){
                S = array[i];
            }
            else{
                L = array[i];
            }
        }
        System.out.println("Smallest element in the given set of array :- "+S);
        System.out.println("Largest element in the given set of array :- "+L);
    }
}