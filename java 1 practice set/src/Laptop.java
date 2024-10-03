import java.util.Scanner;

public class Laptop {
    String brand;
    String model;
    int ramSize;
    int storageSize;

    void start(){
        System.out.println("Laptop has started ");
    }

    void upGradeRam(int ram){
        System.out.println("Upgrade ram by "+ram);
        System.out.println("Tolat ram size is "+(ram+ramSize));
    }

    void laptopDetail(int ram){
        System.out.println("Brand name "+brand);
        System.out.println("Model name "+model);
        System.out.println("Ram size "+(ram+ramSize));
        System.out.println("Storage size "+storageSize);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop lap = new Laptop();
        System.out.println("Enter laptop brand name ");
        lap.brand=sc.nextLine();
        System.out.println("Enter your model name ");
        lap.model=sc.nextLine();
        System.out.println("Enter your ram size");
        lap.ramSize=sc.nextInt();
        System.out.println("Enter your storage");
        lap.storageSize=sc.nextInt();

        System.out.println("Enter your upgraded ram size");
        int upgrade =sc.nextInt();
        lap.start();
        lap.upGradeRam(upgrade);
        lap.laptopDetail(upgrade);

    }


}
