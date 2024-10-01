package src;

import java.util.Scanner;

public class Q6Increment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number ");
        int a = sc.nextInt();
        System.out.println("Enter your second number ");
        int b = sc.nextInt();
        a++;
        b++;
        System.out.println("After increment of a "+a);
        System.out.println("After increment of b "+b);


    }

}
