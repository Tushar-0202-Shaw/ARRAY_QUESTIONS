package Arrays_Questions;
import java.util.Scanner;
public class Merge_Two_Sorted_Array_In_Ascending_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array :- ");
        int n1 = sc.nextInt();
        int[]arr1 = new int[n1];
        System.out.println("Enter "+n1+" elements for 1st array :-");
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array :- ");
        int n2 = sc.nextInt();
        int[]arr2 = new int[n2];
        System.out.println("Enter "+n2+" elements for 2nd array :-");
        for(int j=0;j<n2;j++){
            arr2[j] = sc.nextInt();
        }
        int k =0 ;
        int i=0;
        int j=0;
        int[]arr3 = new int[arr1.length+arr2.length];
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while(i< arr1.length){
            arr3[k++] = arr1[i++];
        }
        while(j<arr2.length){
            arr3[k++] = arr2[j++];
        }
        for(int element : arr3){
            System.out.print(element+" ");
        }
    }
}