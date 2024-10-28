import java.util.ArrayList;
public class Book {
    String title;
    String author;
    String isbn;
    boolean availability;

    Book(){}

    Book(String title,String author,String isbn,boolean availability) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availability = availability;
    }
        public void setAvailability(boolean availability){
            this.availability=availability;
        }

        public boolean isAvailable(){
        return  this.availability;
        }
        public String getIsbn() {
        return isbn;
        }
        public String getTitle(){
        return title;
        }
}

class Library extends Book{

    ArrayList<Book>books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }

    public boolean checkAvailable(Book isbn){
        for (Book b:books) {
            if(b.getIsbn()==isbn.getIsbn()){
                return true;
            }
        }
        return false;
        }
    }

    class Member extends Library {

        String name;
        ArrayList<Book> borrowedBooks;

        Member(String name) {
            this.name = name;
            borrowedBooks = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public ArrayList<Book> getBorrowedBooks(){

            return borrowedBooks;
        }

        public void borrowedBook(Book book){
            if (book.isAvailable()){
                book.setAvailability(false);
                borrowedBooks.add(book);
                System.out.println(book.getTitle()+" borrowed successfully");
            }
            else {
                System.out.println(book.getTitle() + "  currently unavailable");
            }
        }

        public void returnBook(Book book){
            if (borrowedBooks.remove(book)) {
                book.setAvailability(true);
                System.out.println(book.getTitle() + " returned successfully");
            }
            else {
                System.out.println("you have not borrowed "+book.getTitle());
            }
        }

    }

    class Main4 {
        public static void main(String[] args) {

            Member member1 = new Member("gaurav");
            Book book = new Book("the last dragon", "gaurav", "487gfd", true);

            member1.borrowedBook(book);
            member1.returnBook(book);


        }
    }
