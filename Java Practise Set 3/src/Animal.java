import java.util.Scanner;

public class Animal {
    String typeOfAnimal;
    String name;
    int age;


    void input(String typeOfAnimal,String name,int age){
        this.typeOfAnimal=typeOfAnimal;
        this.name=name;
        this.age=age;

    }


    void display(){
        System.out.println("Type of animal -"+ typeOfAnimal);
        System.out.println("age -"+ age);
        System.out.println("Name of animal -"+ name);
    }

}

 class Birds extends Animal{

     void display(){
         System.out.println("Enter the colour of the fathers ");
         Scanner sc = new Scanner(System.in);
         String feather = sc.nextLine();
         System.out.println("Type of animal -"+ typeOfAnimal);
         System.out.println("age -"+ age);
         System.out.println("Name of animal -"+ name);
         System.out.println("The colour of the feather is - "+feather);
     }
}

class Fish extends  Animal {
    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the colour of the fish ");
        String colour = sc.nextLine();
        System.out.println("Type of animal -" + typeOfAnimal);
        System.out.println("age -" + age);
        System.out.println("Name of animal -" + name);
        System.out.println("The colour of fish is - " + colour);
    }
}

class Dispaly{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Birds bird = new Birds();

        System.out.println("Enter the type of animal");
        String animal = sc.nextLine();

        System.out.println("Enter the name of the animal ");
        String name = sc.nextLine();

        System.out.println("Enter the age of the animal");
        int age = sc.nextInt();
       sc.nextLine();
        bird.input(animal,name,age);
        bird.display();

        System.out.println("---------------------------");
        Fish fish = new Fish();

        System.out.println("Enter the type of animal");
        String animal1 = sc.nextLine();

        System.out.println("Enter the name of the animal ");
        String name1 = sc.nextLine();

        System.out.println("Enter the age of the animal");
        int age1 = sc.nextInt();

        fish.input(animal1,name1,age1);
        fish.display();

    }
}
