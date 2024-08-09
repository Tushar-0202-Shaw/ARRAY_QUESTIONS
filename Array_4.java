package Arrays_Questions;
import java.util.Scanner;
public class Array_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :-");
        int n = sc.nextInt();
        int[]array = new int[n];
        System.out.println("Enter elements of array :-");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter checking number");
        int num = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            if(array[i]>num){
                count++;
            }
        }
        System.out.printf("%d numbers are strictly greater than %d in the given set of array",count,num);
    }
}