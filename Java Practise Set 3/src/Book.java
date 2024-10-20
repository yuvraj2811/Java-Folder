import java.util.Scanner;

public class Book {
    String tital;
    String author;
    String isbn;

    void inputDetils(String tital, String author, String isbn){

        this.tital=tital;
        this.author=author;
        this.isbn=isbn;
    }

    void print(){
        System.out.println("----Enter the books within 15 days----");
    }

    void dispalyDetails(){
        System.out.println("Tital name is - "+tital);
        System.out.println("The author name is - "+author);
        System.out.println("The isbn number is - "+isbn);
    }
    void calculate(int days){
        if (days<15){
            System.out.println("No fine you return on time");
        }else {
            days=days-15;
            System.out.println("Per day late fine is rs 5 ");
            System.out.println("Your fine is - "+5*days+"rupee");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();

        book.print();

        System.out.println("Enter the tital of the book");
        String tital = sc.nextLine();

        System.out.println("Enter Author's name ");
        String name=sc.nextLine();

        System.out.println("Enter the isbn number");
        String isbn = sc.nextLine();

        System.out.println("Enter the days you keep the book");
        int bookDate= sc.nextInt();




        book.inputDetils(tital,name,isbn);
        book.dispalyDetails();
        book.calculate(bookDate);
    }
}
