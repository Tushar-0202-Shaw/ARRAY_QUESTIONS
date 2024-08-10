package Arrays_Questions;
import java.util.Scanner;
public class Delete_Element_From_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int s = sc.nextInt();
        int[]arr = new int[s];
        System.out.println("Enter "+s+" elements :-");
        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element you want to delete :- ");
        int x = sc.nextInt();
        int i=0;
        while(arr[i]!=x){
            i++;
        }
        int j=i+1;
        while(j!= arr.length){
            arr[i] = arr[j];
            j++;
            i++;
        }
        for(int l=0;l<s-1;l++){
            System.out.print(arr[l]+" ");
        }
    }
}