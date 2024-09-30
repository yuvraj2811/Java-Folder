import java.util.Scanner;

public class Q1CodingAge {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your first number");
        int a = sc.nextByte();
        System.out.println("Enter your second number");
        int b = sc.nextByte();
        for (int i = 2; i <=b; i++) {
            if (i%2==0){
                System.out.print(i+".Coding ");
            }else {
                System.out.print(" "+i+".Age ");
            }
        }
    }
}
