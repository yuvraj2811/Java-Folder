import java.util.Scanner;

public class Q17PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count =0;
        for (int i = 2; i <=n ; i++) {
            if (n%i==0){
                count++;
            }
        }
        if (count==1){
            System.out.println(n+" is a prime number");
        }else {
            System.out.println(n+" is not a prime number");
        }
    }
}
