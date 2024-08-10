package Arrays_Questions;
import java.util.Scanner;
public class Binary_Prime {
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
    public static String convertToBinary(int n)
    {
        return Integer.toBinaryString(n);
    }
    public static boolean countOddOne(String n)
    {
        int count=0;
        for (int i=0;i<n.length();i++){
            if (n.charAt(i)=='1')
                count++;
        }
        return count%2 == 1;
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
        System.out.println("Prime numbers having odd 1's :-");
        for (int i=0;i<s;i++){
            if (isPrime(arr[i])){
                String str=convertToBinary(arr[i]);
                if (countOddOne(str)){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}