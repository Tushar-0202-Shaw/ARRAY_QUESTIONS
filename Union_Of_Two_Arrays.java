package Arrays_Questions;
import java.util.Arrays;
import java.util.Scanner;
public class Union_Of_Two_Arrays {
    static void output(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int m = arr1.length;
        int n = arr2.length;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                // Both are equal, print only one
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        // Print remaining elements of arr1
        while (i < m) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        // Print remaining elements of arr2
        while (j < n) {
            System.out.print(arr2[j] + " ");
            j++;
        }
        System.out.println(); // Move to next line after printing the union
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array :-");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        System.out.println("Enter elements for 1st array :-");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of second array :-");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Enter elements for 2nd array :-");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        // Optional: Sort arrays if you cannot guarantee they are sorted
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.print("arr1 U arr2 :- ");
        output(arr1, arr2);
    }
}