import java.util.Scanner;

public class Movie {

    String title;
    String genre;
    int duration;
    double rating;

    void watch(){
        System.out.println("Movie is being watched");
    }

    void rateMovie(double rate){
        System.out.println("New rating of a movie is "+rate);
    }
    void printDetails(double rate){
        System.out.println("Title "+title);
        System.out.println("Genre "+genre);
        System.out.println("Duration "+duration);
        System.out.println("Rating "+rate);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie mov = new Movie();
        System.out.println("Enter the tital of a movie");
        mov.title=sc.nextLine();
        System.out.println("Enter the genre of a movie ");
        mov.genre=sc.nextLine();
        System.out.println("Enter the duration of a movie in minutes ");
        mov.duration=sc.nextInt();
        System.out.println("Enter your rating of a movie out of 10");
        mov.rating=sc.nextDouble();

        System.out.println("Enter the new rating of a movie");
        double newRating =sc.nextDouble();

        mov.watch();
        mov.rateMovie(newRating);
        mov.printDetails(newRating);





    }


}
