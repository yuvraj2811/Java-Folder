import java.util.Scanner;

public class Q13Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your base");
        int base = sc.nextInt();
        System.out.println("Enter your power");
        int pow=sc.nextInt();
        int power=1;

        for (int i = 1; i <=pow ; i++) {
            power=power*base;
        }
        System.out.println("Output = "+power);

    }
}