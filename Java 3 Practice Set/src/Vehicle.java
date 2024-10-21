import java.util.Scanner;

public class Vehicle {
    String brand;
    String model;

    Vehicle(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
}

class Car extends Vehicle{

    int numberOfDoors;
    Car(String brand,String model,int numberOfDoors){

        super(brand, model);

        this.numberOfDoors=numberOfDoors;

    }

    void showDetails(){
        System.out.println("Brand name - "+brand);
        System.out.println("Model name "+model);
        System.out.println("Number of doors in the car - "+numberOfDoors);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the brand name");
        String brand = sc.nextLine();

        System.out.println("Enter the model name");
        String model = sc.nextLine();

        System.out.println("Enter the gate of the door of the class");
        int door = sc.nextInt();

        Car car = new Car(brand,model,door);
        car.showDetails();


    }
}