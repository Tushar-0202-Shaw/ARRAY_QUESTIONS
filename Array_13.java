package Arrays_Questions;
import java.util.Scanner;
public class Array_13 {
    public static int[] makeFrequencyArray(int[]array){
        int[]frequency = new int[100001]; //size given in question
        for(int i : array){
            frequency[i]++;
        }
        return frequency;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int n = sc.nextInt();
        int[]array = new int[n];
        System.out.println("Enter "+n+" elements :- ");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter number of queries");
        int q = sc.nextInt();
        int[]frequency = makeFrequencyArray(array);
        while(q>0){
            System.out.print("Enter number to be searched :- ");
            int x = sc.nextInt();
            if(frequency[x]>0){
                System.out.println(x+" is present");
            }
            else{
                System.out.println(x+" is not present");
            }
            q--;
        }
    }
}