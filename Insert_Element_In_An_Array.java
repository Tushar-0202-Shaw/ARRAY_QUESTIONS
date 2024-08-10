package Arrays_Questions;
import java.util.Scanner;
public class Insert_Element_In_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :- ");
        int s = sc.nextInt();
        int[]arr = new int[s+1];
        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element you want to insert :-");
        int ins = sc.nextInt();
        System.out.printf("Enter index where you want to insert %d :-",ins);
        System.out.println();
        int idx = sc.nextInt();
        for(int i=s;i>idx;i--){
            arr[i] = arr[i-1];
        }
        arr[idx] = ins;
        for(int i=0;i<=s;i++){
            System.out.print(arr[i]+" ");
        }
    }
}