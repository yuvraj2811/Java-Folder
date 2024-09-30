package src;

import java.util.Scanner;

public class Q10ConvertUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your caracter");
        char c;
        char ch = sc.next().charAt(0);
        if (ch>='a'&&ch<='z'){
            c= Character.toUpperCase(ch);
            System.out.println(c);
        }else {
            System.out.println("Already upper case");
            c= Character.toUpperCase(ch);
        }

        }
    }

