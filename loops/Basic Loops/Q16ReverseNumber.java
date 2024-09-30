import java.util.Scanner;

public class Q16ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rem,rev;
        rev=0;
        while(n>0){
            rem=n%10;
            rev=10*rev+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
