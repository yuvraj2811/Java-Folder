import java.util.Scanner;

public class Flight {
    String flightNumber;
    String destination;
    int duration;
    double ticketPrice;

    void boardFlight(){
        System.out.println("The flight is boarding");
    }

    void updateTicketPrice(double newPrice){
        this.ticketPrice=newPrice;
        System.out.println("The new ticket price is "+newPrice);
    }

    void printDetails(){
        System.out.println("The flight number is "+flightNumber);
        System.out.println("The destination of the flight is "+destination);
        System.out.println("The flight duration is "+duration+" hours");
        System.out.println("The price of the flight is "+ticketPrice);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flight fly = new Flight();
        System.out.println("Enter the flight number ");
        fly.flightNumber=sc.nextLine();
        System.out.println("Enter the destination of a flight ");
        fly.destination=sc.nextLine();
        System.out.println("Enter the duration of the flight");
        fly.duration=sc.nextInt();
        System.out.println("Enter the price of the ticket ");
        fly.ticketPrice=sc.nextDouble();
        System.out.println("Enter the new price of the ticket");
        double newPrice = sc.nextDouble();

        fly.boardFlight();
        fly.updateTicketPrice(newPrice);
        fly.printDetails();
    }


}
