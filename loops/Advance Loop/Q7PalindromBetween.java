import java.util.Scanner;

public class Q7PalindromBetween {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your first number");
        int n =sc.nextInt();
        System.out.println("Enter your second number");
        int n1=sc.nextInt();
        int num=n;
        int rem;
        int rev=0;
        System.out.println("Palindrom" );
        while (true) {
            while (num>0){
                rem = num%10;
                rev=rev*10+rem;
                num=num/10;
            }
            if (rev==n) {
                System.out.print(rev + " ");
            }
                n++;
                num=n;
                rev=0;
                if (n==n1){break;}


        }
    }
}
