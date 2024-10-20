
public class Vehical {
    String model;
    int id ;
    double cost;

    void run(){
        System.out.println("Vehical is running");
    }
}

class Car extends Vehical{
    String colour;
    String name;
void run(){
    System.out.println(name+" car is runninig ");
}
 void input(String name,String colour,String model,int id,double cost){
    this.name=name;
    this.colour=colour;
    this.model=model;
    this.id=id;
    this.cost=cost;
 }
 void display(){
     System.out.println(name);
     System.out.println(colour);
     System.out.println(model);
     System.out.println(id);
     System.out.println(cost);
 }
    public static void main(String[] args) {


    Car car = new Car();
    car.input("alto","red","tata",44,500000);
    car.display();
    car.run();

    }

}