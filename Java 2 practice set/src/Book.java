import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "Title-" + title + " Author-" + author + " Price-" + price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title");
        String title = sc.nextLine();

        System.out.println("Enter author's name ");
        String author = sc.nextLine();

        System.out.println("Enter book price ");
        double price = sc.nextDouble();
        sc.nextLine(); // Consume newline left-over

        Book book = new Book(title, author, price);
        System.out.println(book.toString());

        System.out.println("Enter the title");
        String title1 = sc.nextLine();

        System.out.println("Enter author's name ");
        String author1 = sc.nextLine();

        System.out.println("Enter book price ");
        double price1 = sc.nextDouble();
        sc.nextLine(); // Consume newline left-over

        Book book1 = new Book(title1, author1, price1);
        System.out.println(book1.toString());

       // sc.close(); its stops taking input
}
}