import java.util.Scanner;

public class Q3MaxMinDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int max=-9999;
        int min=9999;
        System.out.println("Enter your number");
        int n = sc.nextInt();

        while (n>0){
            int rem = n%10;
            if (max<rem){max=rem;}
            if (min>rem){min=rem;}
            n=n/10;
        }
        System.out.println("The max digit is "+max);
        System.out.println("The min digit is "+min);
    }
}
