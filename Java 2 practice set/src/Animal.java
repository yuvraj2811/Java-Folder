
public class Animal {
    String name;

    void sound(){;
        System.out.println("This animal making a sound");
    }



}
 class Dog extends Animal{

     void sound(){
         int age;
         System.out.println("Dogs barks");
     }

 }


 class Cat extends Animal{
   int id;
    void sound(){
        System.out.println("Cats meows");
    }


 }

 class Instance{
     public static void main(String[] args) {
         Animal dog = new Dog();
         dog.sound();

         Animal cat = new Cat();
         cat.sound();

     }
 }