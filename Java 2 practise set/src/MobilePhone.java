import java.util.Scanner;

public class MobilePhone {
    String brand;
    String model;
    double price;



    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter brand name");
        String brand = sc.nextLine();
        System.out.println("Enter model name");
        String model = sc.nextLine();
        System.out.println("Enter your price of mobile ");
        double price= sc.nextDouble();
        sc.nextLine();

        MobilePhone mobile = new MobilePhone(brand,model,price);
        System.out.println(mobile);


        System.out.println("Enter brand name");
        String brand1 = sc.nextLine();
        System.out.println("Enter model name");
        String model1 = sc.nextLine();
        System.out.println("Enter your price of mobile ");
        double price1= sc.nextDouble();
        sc.nextLine();

        MobilePhone mobile1 = new MobilePhone(brand1,model1,price1);
        System.out.println(mobile1);

    }
}
