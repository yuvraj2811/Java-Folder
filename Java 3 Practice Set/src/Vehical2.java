public class Vehical2 {
    final void run(){
        System.out.println("Vehical is running ");
    }
}
class Car2 extends Vehical2{
//    void run(){
//        System.out.println(" Car is running ");
//    }
    void colour(){
        System.out.println("Car colour is red");
    }

    public static void main(String[] args) {
        Car2 car = new Car2();
       // car.run();
        System.out.println("You can not override the final method if you try this message is show to you");
        System.out.println();
        System.out.println("java: run() in Car cannot override run() in Vehical2\n" +
                "  overridden method is final");
        System.out.println("------------------*----------------");
        car.colour();
    }
}