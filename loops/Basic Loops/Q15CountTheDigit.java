import java.util.Scanner;

public class Q15CountTheDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int n = sc.nextInt();
        int count=0;
        while (n>0){
            count++;
            n=n/10;
        }
        System.out.println("Digit Count = "+count);
    }
}
