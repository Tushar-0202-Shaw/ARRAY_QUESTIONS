package Arrays_Questions;
import java.util.*;
public class Array_9_Second_Largest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int n = sc.nextInt();
        int[]array = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]>array[j]){
                    int temp ;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp ;
                }
            }
        }
        int ans = 0;
        for(int i= array.length-1;i>=1;i--){
            if(array[i]!=array[i-1]){
                ans=array[i-1];
                break;
            }
        }
        System.out.println("2nd largest element in the given set of array :- "+ans);
    }
}