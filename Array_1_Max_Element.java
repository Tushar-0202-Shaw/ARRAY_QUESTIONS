package Arrays_Questions;
import java.util.Scanner;
public class Array_1_Max_Element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of array");
        for(int i =0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int ans =0;
        for(int i=0;i<n;i++){
            if(ans<array[i]){
                ans = array[i];
            }
        }
        System.out.println("Max element :- "+ans);
    }
}
