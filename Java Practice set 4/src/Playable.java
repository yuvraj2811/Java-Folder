

public interface Playable {

    void play();
}

interface  Recordable{

    void record();
}

class SmartDevice implements Playable,Recordable{

    String deviceName;
    int battery;
    int storageCapacity;

    SmartDevice(String deviceName,int battery,int storageCapacity){

        this.deviceName=deviceName;
        this.battery=battery;
        this.storageCapacity=storageCapacity;
    }


   public void play(){
       if (battery>10){
           System.out.println("Music is playing ");
       }
       else{
           System.out.println("Please plug the charger - battery low");
       }

    }

   public void record(){

        if (storageCapacity>10){
            System.out.println("The song is recording");
        }
        else {
            System.out.println("The storage is low ");
        }
    }
}

class Main5{
    public static void main(String[] args) {
        SmartDevice device = new SmartDevice("samsung 452",9,256);

       device.play();

    }
}