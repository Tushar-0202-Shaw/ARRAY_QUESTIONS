package Arrays_Questions;
import java.util.Scanner;
public class Searching_Prime_Number_In_Array {
    public static boolean isPrime(int n)
    {
        if (n==1) return false;
        int i=2;
        while(i<n)
        {
            if (n%i==0) return false;
            i++;
        }
        return true;
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
        for (int element :arr)
        {
            if (isPrime(element))
                System.out.print(element+" ");
        }
    }
}