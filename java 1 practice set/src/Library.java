import java.util.Scanner;

public class Library {
    String name;
    String location;
    int booksAvailable;
    double memberShipFee;

    void borrowBook(){
        System.out.println("You borrowed a book ");
        booksAvailable=booksAvailable-1;
    }

    void returnBook(){
        System.out.println("You return book ");
        booksAvailable=booksAvailable+1;
    }

    void printDetails(){
        System.out.println("Name of a library-"+name);
        System.out.println("Location of a library-"+location);
        System.out.println("Numbers of books available-"+booksAvailable);
        System.out.println("Member ship fee of a library-"+memberShipFee);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib= new Library();

        System.out.println("Enter name of a library");
        lib.name=sc.nextLine();
        System.out.println("Enter the location of a library");
        lib.location=sc.nextLine();
        System.out.println("Enter the number of book available in library");
        lib.booksAvailable=sc.nextInt();
        System.out.println("Enter the library member fee ");
        lib.memberShipFee=sc.nextDouble();


        lib.borrowBook();
        lib.returnBook();
        lib.printDetails();

    }

}
