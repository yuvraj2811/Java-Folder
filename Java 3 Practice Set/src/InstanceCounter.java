

public class InstanceCounter {

   static int count;

   InstanceCounter(){
       InstanceCounter.count++;
   }
    static void display(){
       System.out.println("Number of instance is - "+InstanceCounter.count);
   }

    public static void main(String[] args) {
        InstanceCounter call = new InstanceCounter();
        InstanceCounter call2 = new InstanceCounter();

        InstanceCounter.display();




    }
}
