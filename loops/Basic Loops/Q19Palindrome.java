import java.util.Scanner;

public class Q19Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int num=n;
        int rev,rem;
        rev=0;
        while (n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if (rev==num){
            System.out.println(rev +" is a palindrome number ");
        }else {
            System.out.println(rev+" is not a palindrome number");
        }

    }
}
