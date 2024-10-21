

public class Appliance {

    void turnOn(){
        System.out.println("The application is now on ");
    }
}

class Fan extends Appliance{
    @Override
    void turnOn() {
        System.out.println("The fan is now spinning ");
    }
}
class Light extends Appliance{
    @Override
    void turnOn() {
        System.out.println("The light is now glowing ");
    }
}
class AirConditioner extends Appliance{
    @Override
    void turnOn() {
        System.out.println("The air conditioner is now cooling ");
    }
}
class Main2{
    public static void main(String[] args) {
        Appliance[] appliances = new Appliance[3];
        appliances[0]= new Fan();
        appliances[1]= new Light();
        appliances[2]= new AirConditioner();

        for (int i =0;i<3;i++){
            appliances[i].turnOn();
        }
    }
}