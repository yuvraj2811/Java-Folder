import java.util.Scanner;

public class Q2 {
   static Scanner sc = new Scanner(System.in);

    void input(int arr[],int size){
        for (int i = 0; i <size ; i++) {
            System.out.println("Enter the "+(i+1)+" eliment of an array");
            arr[i]=sc.nextInt();
        }
        print(arr,size);
    }

    void print(int arr[],int size){
        for (int i = 0; i <size ; i++) {
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {

        System.out.println("Enter the size of an array");
        int n =sc.nextInt();
        int[] arr= new int[n];
        Q1 obj = new Q1();
        obj.input(arr,n);
    }
}
