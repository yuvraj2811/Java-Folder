import java.util.Scanner;

public class Hotel {

    String name;
    String location;
    int roomAvailable;
    double rating;

    void bookRoom(){
        roomAvailable=roomAvailable-1;
        System.out.println("Booking successful");
    }

    void cancelRoom(){
        roomAvailable=roomAvailable+1;
        System.out.println("Room booking canceled");
    }

    void priintDetails(){

        System.out.println("The name of the hotel -"+name);
        System.out.println("The location of the hotel -"+location);
        System.out.println("The number of room is available -"+roomAvailable);
        System.out.println("The rating of the hotel is "+rating);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        System.out.println("Enter the name of the hotel ");
        hotel.name=sc.nextLine();
        System.out.println("Enter the location of the hotel");
        hotel.location=sc.nextLine();
        System.out.println("Enter the number of rooms available in the hotel");
        hotel.roomAvailable=sc.nextInt();
        System.out.println("Enter the rating of the hotel ");
        hotel.rating=sc.nextDouble();

        hotel.bookRoom();
        hotel.cancelRoom();
        hotel.priintDetails();

    }
}
