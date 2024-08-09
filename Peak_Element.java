package Arrays_Questions;
import java.util.Scanner;
public class Peak_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter "+n+" numbers :-");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Peak Elements :- ");
        for(int i=1;i<n-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        int i=0;
        int j=arr.length-1;
        if(arr[i]>arr[i+1]){
            System.out.print(arr[i]+" ");
        }
        if(arr[j]>=arr[j-1]){
            System.out.print(arr[j]+" ");
        }
    }
}