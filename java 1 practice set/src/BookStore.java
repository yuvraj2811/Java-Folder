import java.util.Scanner;

public class BookStore {

    String name;
    String address;
    int booksInStock;
    double rating;

    void sellBooks(int numberSold){
        System.out.println("The number of book is sold -"+numberSold);
        booksInStock=booksInStock-numberSold;
        System.out.println(booksInStock+" books left");
    }

    void addBook(int numberAdded){
        System.out.println("The number of book is added -"+numberAdded);
        booksInStock=booksInStock+numberAdded;
        System.out.println("The new stock of book after added is- "+booksInStock);
    }

    void printDetails(){
        System.out.println("Name of book store -"+name);
        System.out.println("Address of book store -"+address);
        System.out.println("Number of book in stock -"+booksInStock);
        System.out.println("Rating of a book store is -"+rating);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookStore book = new BookStore();
        System.out.println("Enter the name of book store ");
        book.name =sc.nextLine();
        System.out.println("Enter the address of a book store");
        book.address=sc.nextLine();
        System.out.println("Enter number of book(Stocks) in the store");
        book.booksInStock=sc.nextInt();
        System.out.println("Rating for book store");
        book.rating=sc.nextDouble();

        System.out.println("Enter number of book is sold");
        int sold = sc.nextInt();


        System.out.println("Enter number of books added in the stocks");
        int add=sc.nextInt();

        book.sellBooks(sold);
        book.addBook(add);
        book.printDetails();



    }


}
