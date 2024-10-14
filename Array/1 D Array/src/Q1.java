import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size of  an array");
        int n = sc.nextInt();
        int[]arr= new int[n];

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter your first "+(i+1)+" eliment of an array");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(arr[i]);
        }
    }



}
