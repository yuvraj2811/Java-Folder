import java.util.Scanner;

public class Q10Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int n = sc.nextInt();
        System.out.println("Enter your second number");
        int n1 = sc.nextInt();
        float average;
        float sum=0; int count =0;

        for(int i = n; i <=n1 ; i++) {
            sum=sum+i;
            count++;
        }
        average=sum/count;
        System.out.println("The average of number is "+average);
    }
}
