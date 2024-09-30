import java.util.Scanner;

public class Q2MaxMinAverage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int max = -9999;
        int min = 9999;
        Float sum =0f;
        for (int i =1; i <=10 ; i++) {
            System.out.println("Enter your number");
            int n = sc.nextInt();
            if (n>max){max=n;}
            if (n < min) {min = n;}
                sum = sum + n;
            }
        float average = sum/10;
        System.out.println("max ="+max);
        System.out.println("min ="+min);
        System.out.println("average ="+average);
        }


    }

