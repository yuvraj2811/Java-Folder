import java.util.Scanner;

public class Q21HCF {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your first number ");
        int n = sc.nextInt();
        System.out.println("Enter your second number");
        int n1 =sc.nextInt();
        int hcf=0;
        int min = n>n1? n1:n;
        for (int i = 1; i <min ; i++) {
            if (min%i==0){
                hcf=i;
            }
        }
        System.out.println("The HCF is "+hcf);
    }
}
