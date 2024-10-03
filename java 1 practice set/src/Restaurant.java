import java.util.Scanner;

public class Restaurant {
    String name;
    String location;
    String cuisineType;
    double averageCost;

    void serveDish(String dishName){
        System.out.println(dishName+" served");
    }
    void updatecost(double newCost){
        this.averageCost=newCost;
    }

    void printDetails(){
        System.out.println("Name of Resturant-"+name);
        System.out.println("Location of Resturant-"+location);
        System.out.println("Cuisine Type-"+cuisineType);
        System.out.println("Average Cost per person-"+averageCost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant res =new Restaurant();
        System.out.println("Enter your resturant name");
        res.name=sc.nextLine();
        System.out.println("Enter your resturant location ");
        res.location=sc.nextLine();
        System.out.println("Enter your Cusine Type");
        res.cuisineType=sc.nextLine();
        System.out.println("Enter Average cost per person");
        res.averageCost=sc.nextDouble();
        sc.nextLine();//Consume new line
        System.out.println("Enter dish name ");
        String dishName=sc.nextLine();
        System.out.println("Enter average new cost person ");
        double newCost =sc.nextDouble();
        res.serveDish(dishName);
        res.updatecost(newCost);
        res.printDetails();
    }

}
