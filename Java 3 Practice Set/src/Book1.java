import java.util.Scanner;

public class Book1 {
    String title ;
    String author ;
    double price;

    Book1(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;

    }

    void display(){
        System.out.println("Title of the book - "+title);
        System.out.println("Author - "+author);
        System.out.println("Price of the book "+price);
    }
}

class Display{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter the title of the book");
        String title =sc.nextLine();

        System.out.println("Enter the Author name ");
        String author = sc.nextLine();

        System.out.println("Enter the price of book");
        int price = sc.nextInt();

        Book1 book = new Book1(title,author,price);
        book.display();

    }
}

