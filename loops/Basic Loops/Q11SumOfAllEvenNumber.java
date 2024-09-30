import java.util.Scanner;

public class Q11SumOfAllEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int n = sc.nextInt();
        System.out.println("Enter your second number");
        int n1 = sc.nextInt();
        int sum =0;
        for (int i = n; i <=n1 ; i++) {
            if (i%2==0){
                sum=sum+i;
            }
        }

        System.out.println("Sum of all even numver "+sum);
    }
}
