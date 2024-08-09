package Arrays_Questions;
import java.util.Scanner;
public class Array_3_Check_Number_Of_Occurrence_Of_An_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int n = sc.nextInt();
        int[]array = new int [n];
        System.out.println("Enter elements of array :-");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter element you want to check the occurrence :-");
        int num = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(array[i]==num){
                count++;
            }
        }
        System.out.printf("%d is present %d times in the array",num,count);
    }
}