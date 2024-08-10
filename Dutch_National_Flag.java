package Arrays_Questions;
import java.util.Scanner;
public class Dutch_National_Flag {
    static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void dutchNationalFlag(int[]arr){
        int low = 0 , mid = 0 , high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int s = sc.nextInt();
        int[]arr = new int[s];
        System.out.println("Enter "+s+" elements :-");
        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }
        dutchNationalFlag(arr);
        for(int i:arr)
            System.out.print(i+" ");
    }
}