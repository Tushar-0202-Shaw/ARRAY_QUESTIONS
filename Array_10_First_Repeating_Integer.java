package Arrays_Questions;
import java.util.*;
public class Array_10_First_Repeating_Integer {
    public static int Repeating_Integer(int[]array){
        int n = array.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]==array[j]){
                    return array[i];
                }
            }
        }
        return -1;
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
        System.out.println("First repeating integer :- "+Repeating_Integer(array));
    }
}