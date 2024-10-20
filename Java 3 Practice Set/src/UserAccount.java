import java.util.Scanner;

public class UserAccount {
    private String username;
    private  String email;
    private  int password;

    public void set(String username,String email,int password){
        this.username=username;
        this.email=email;
        this.password=password;
    }

    public void get(){
        System.out.println("User name - "+username);
        System.out.println("User email - "+email);
        System.out.println("User password - "+password);
    }
}
class Details{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserAccount user = new UserAccount();

        System.out.println("Enter the name of account holder");
        String name = sc.nextLine();

        System.out.println("Enter the email the of user of account holder  ");
        String email = sc.nextLine();

        System.out.println("Enter the password ");
        int password = sc.nextInt();

        user.set(name,email,password);
        user.get();

    }
}
