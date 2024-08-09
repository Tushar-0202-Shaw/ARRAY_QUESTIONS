package Arrays_Questions;
import java.util.Scanner;
public class Array_19_Array_Can_Be_Converted_Into_Two_SubArrays_Of_Equal_Sum_Or_Not {
    public static void pref(int[]array){
        int n = array.length;
        int[]prefix = new int[n];
        prefix[0] = array[0];
        int[]suffix = new int[n];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+array[i];
        }
        suffix[n-1] = array[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1]+array[i];
        }
        boolean res = false;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n;j++){
                if(prefix[i]==suffix[j]){
                    res = true ;
                    break;
                }
            }
        }
        if(res){
            System.out.println("Yes! given array can be converted into two sub-arrays with equal sum");
        }
        else{
            System.out.println("No! given array cannot be converted into two sub-arrays with equal sum");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[]array = new int[n];
        System.out.println("Enter "+n+" elements");
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        pref(array);
    }
}