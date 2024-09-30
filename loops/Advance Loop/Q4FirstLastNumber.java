import java.util.Scanner;

public class Q4FirstLastNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n =sc.nextInt();
        int last=n%10;
        int first=0;
        while (n>0){
            first=n;
            n=n/10;
        }
        System.out.println("First digit of a number "+first);
        System.out.println("last digit of a number "+last);
    }
}
