import java.util.Scanner;

public class MusicAlbum {
    String title;
    String artist;
    int totalSong;
    double price;

    void playSong(int numberOfSong){
        System.out.println(numberOfSong+" number song is played");
    }

    void changePrice(double newPrice){
        this.price=newPrice;
        System.out.println("The new price of a album is "+newPrice);
    }

    void printDetails(){
        System.out.println("The tital of a song-"+title);
        System.out.println("The artist name is-"+artist);
        System.out.println("The total number of songs in album-"+totalSong);
        System.out.println("The price of a album-"+price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicAlbum music = new MusicAlbum();
        System.out.println("Enter the tital's name ");
        music.title=sc.nextLine();
        System.out.println("Enter the artist name");
        music.artist= sc.nextLine();
        System.out.println("Enter the number of songs in the album");
        music.totalSong= sc.nextInt();
        System.out.println("Enter the price of the album");
        music.price=sc.nextDouble();

        System.out.println("Enter the new price of the album");
        double newPrice=sc.nextDouble();

        System.out.println("Enter the number of song you want to play : eg 1,2,3");
        int numberOfSong = sc.nextInt();
        music.playSong(numberOfSong);
        music.changePrice(newPrice);
       music.printDetails();

    }


}
