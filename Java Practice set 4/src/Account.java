

public abstract class Account {
   private String name;
   private long accountNumber;
  private   String address;
    double bankBalance;

  Account(){}

    Account(String name,int accountNumber,String address,double bankBalance){
      this.name=name;
      this.accountNumber=accountNumber;
      this.address=address;
      this.bankBalance=bankBalance;
    }

    public String getName() {
        return name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAddress() {
        return address;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public   abstract double deposite(double amount);

 public abstract  double withDraw(double amount);

}
//-------------------------------------------------------------------------
interface InterestBearing{
 public void  applyInterest(double intrest);
}
//--------------------------------------------------------------------------

class SavingAccount extends Account implements InterestBearing{

 SavingAccount(String name , int accountNumber,String address, double bankBalance){
     super(name,accountNumber,address,bankBalance);
 }

    public double maxWithdrawLimit(){
        return  100000;
    }
    @Override
    public double deposite(double amount){
        System.out.println("Adding money in bank balance");
        bankBalance=bankBalance+amount;
     return bankBalance;
    }

    @Override
    public  double withDraw(double amount){
     if (bankBalance<amount){
         System.out.println("Can not process because not enough amount in your bank account ");
         return 0;
     } else if (amount>maxWithdrawLimit()) {
         System.out.println("You can not withdraw money more than your daily limits ");
         return 0;
     }
     else {
         System.out.println("With draw money successfully");
         bankBalance = bankBalance - amount;
         return amount;
     }
    }

    @Override
    public void applyInterest(double intrest) {
     double interest1= intrest*0.01*bankBalance;
        System.out.println("Addiing intrest to your bank account");
        bankBalance=bankBalance+interest1;
    }

    public void displaySavingAccount(){
        System.out.println("Name of a account holder -"+getName());
        System.out.println("Account number -"+getAccountNumber());
        System.out.println("Address of a account holder -"+getAddress());
        System.out.println("Bank Balance -"+getBankBalance());

    }
}

//------------------------------------------------------------------------------------------------------------

class CurrentAccount extends Account{

    CurrentAccount(String name,int accountNumber,String address,double bankBalance){
        super(name,accountNumber,address,bankBalance);
    }
    public double overDraftLimit(){
            return 10000;
        }
    public double maxWithdrawLimit(){
        return  100000;
    }

    @Override
    public double deposite(double amount){
        System.out.println("Adding money in bank balance");
        bankBalance=bankBalance+amount;
        return bankBalance;
    }
        @Override
    public double withDraw(double amount ){
        if (bankBalance<0 && amount<overDraftLimit()){
            System.out.println("Your over draft limit is "+overDraftLimit());
            System.out.println("Remaining over draft limit is ");
            bankBalance=bankBalance-amount;
            return bankBalance;
        }

         else if (bankBalance<amount){
            System.out.println("Can not process because not enough amount in your bank account ");
            return 0;
        }

         else if (amount>maxWithdrawLimit()) {
            System.out.println("You can not withdraw money more than your daily limits ");
            return 0;

        }
      else {
            System.out.println("With draw money successfully");
            bankBalance = bankBalance - amount;
            return amount;
        }
    }
    public void displaySavingAccount(){
        System.out.println("Name of a account holder -"+getName());
        System.out.println("Account number -"+getAccountNumber());
        System.out.println("Address of a account holder -"+getAddress());
        System.out.println("Bank Balance -"+getBankBalance());

    }

}

class Main2{
    public static void main(String[] args) {
        SavingAccount savingAccount1 = new SavingAccount("gaurav",4552848,"East patel nagar",50000);
        savingAccount1.deposite(2000);
        savingAccount1.displaySavingAccount();
        savingAccount1.withDraw(30000);
        System.out.println(savingAccount1.getBankBalance());

        CurrentAccount currentAccount1= new CurrentAccount("abhishek",45587,"boring rode",30000);
        currentAccount1.withDraw(30000);
        System.out.println(currentAccount1.getBankBalance());
        System.out.println(currentAccount1.withDraw(5000));
    }
}