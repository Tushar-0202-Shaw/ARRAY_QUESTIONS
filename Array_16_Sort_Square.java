package Arrays_Questions;
import java.util.Scanner;
public class Array_16_Sort_Square {
    public static int[] SortSquare(int[] array) {
        int n = array.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = n - 1;
        while (left <= right) {
            if (Math.abs(array[left]) > Math.abs(array[right])) {
                ans[k--] = array[left] * array[left];
                left++;
            } else {
                ans[k--] = array[right] * array[right];
                right--;
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(ans[j]>ans[j+1]){
                    int temp = ans[j];
                    ans[j] = ans[j+1];
                    ans[j+1] = temp;
                }
            }
        }
        return ans;
    }
    public static void PrintArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original array :-");
        PrintArray(array);
        int[] ans = SortSquare(array);
        System.out.println("Required Array :-");
        PrintArray(ans);
    }
}