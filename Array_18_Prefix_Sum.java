package Arrays_Questions;
import java.util.Scanner;
public class Array_18_Prefix_Sum {
    public static int Pref(int[]array,int s,int e){
        int n = array.length;
        int[]prefix = new int[n];
        prefix[0] = array[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+array[i];
        }
        System.out.println("Prefix Array :-");
        for(int i=0;i<n;i++){
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        int[]prefix_sum = new int[n];
        prefix_sum[0]=prefix[0];
        for(int i=1;i<n;i++){
            prefix_sum[i]=prefix_sum[i-1]+prefix[i];
        }
        return (s==0)?prefix_sum[e]:prefix_sum[e]-prefix_sum[s-1];
    }
    public static void PrintArray(int[]array){
        for(int i : array){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[]array = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Original array :-");
        PrintArray(array);
        System.out.print("Enter number of queries :- ");
        int q = sc.nextInt();
        while(q>0){
            System.out.print("Enter starting address :- ");
            int s = sc.nextInt();
            System.out.print("Enter ending address :- ");
            int e = sc.nextInt();
            System.out.println("Prefix Sum Will be : "+Pref(array,s,e));
            q--;
        }
    }
}