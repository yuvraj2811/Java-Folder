import java.util.Scanner;

public class BankLoan {

    String loanType;
    double loanAmount;
    double intrestRate;
    int tenure;

    void applyForLoan(double amount){
        this.loanAmount=amount;
        System.out.println("The apply amount is "+loanAmount);

    }

    void updateIntrestRate(double newRate){
        this.intrestRate=newRate;
        System.out.println("The intrest rate is "+intrestRate);
    }

    void printDetailes(){
        System.out.println("The type of a loan -"+loanType);
        System.out.println("The amount of a loan -"+loanAmount);
        System.out.println("The interest rate of the loan -"+intrestRate);
        System.out.println("The laon tenure in years -"+tenure);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankLoan obj = new BankLoan();

        System.out.println("Enter Type of a loan");
        obj.loanType=sc.nextLine();

        System.out.println("Enter amount of a loan ");
        obj.loanAmount=sc.nextDouble();

        System.out.println("Enter interest rate of a loan ");
        obj.intrestRate=sc.nextDouble();

        System.out.println("Enter the tenure in years");
        obj.tenure=sc.nextInt();

        System.out.println("Enter the new amount ");
        double newAmount = sc.nextDouble();

        System.out.println("Enter the new intrest rate of the loan");
        double newRate = sc.nextDouble();

        obj.applyForLoan(newAmount);
        obj.updateIntrestRate(newRate);
        obj.printDetailes();
    }
}
