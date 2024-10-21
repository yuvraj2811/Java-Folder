import java.util.Scanner;

public interface Product {
    String productName();
    double getPrice();
}

class Electronics implements Product{
    String brand;
    String productName;
    String warrantyPeriod;
    double price;

    void setElectronics(String brand,String productName,String warrantyPeriod,double price){
        this.brand=brand;
        this.productName=productName;
        this.warrantyPeriod=warrantyPeriod;
        this.price=price;
    }

    public String productName(){
        System.out.print("Product name - ");
        return productName;
    }

     public double getPrice(){
        System.out.print("The price of a Product - ");
        return price;
    }


}

class Clothing implements Product{

    String brand;
    String productName;
    String warrantyPeriod;
    double price;

    void setClothing(String brand,String productName,String warrantyPeriod,double price){
        this.brand=brand;
        this.productName=productName;
        this.warrantyPeriod=warrantyPeriod;
        this.price=price;
    }

    public String productName(){
        System.out.print("Product name - ");
        return productName;
    }

    public double getPrice(){
        System.out.print("The price of a Product - ");
        return price;
    }


}
class ProductDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Electronics electronics= new Electronics();

        System.out.println("For Electronics - ");

        System.out.println("Enter the brand name ");
        String brand =sc.nextLine();

        System.out.println("Enter the Product name");
        String productName=sc.nextLine();

        System.out.println("Enter the warrant period");
        String warranty= sc.nextLine();

        System.out.println("Enter the price of the product");
        double price = sc.nextDouble();
        sc.nextLine();

        electronics.setElectronics(brand,productName,warranty,price);
        System.out.println(electronics.productName());
        System.out.println(electronics.getPrice());

        System.out.println("-------------------------*----------------------");
        Clothing clothing= new Clothing();

        System.out.println("For clothing - ");

        System.out.println("Enter the brand name ");
        String brand1 =sc.nextLine();

        System.out.println("Enter the Product name");
        String productName1=sc.nextLine();

        System.out.println("Enter the warrant period");
        String warranty1= sc.nextLine();

        System.out.println("Enter the price of the product");
        double price1 = sc.nextDouble();

        clothing.setClothing(brand1,productName1,warranty1,price1);
        System.out.println(clothing.productName());
        System.out.println(clothing.getPrice());
    }

}