

public class Coding {
    String name;
    int id;
    String address;

    Coding(String name,int id,String address) {

        this.name=name;
        this.id=id;
        this.address=address;

    }
    void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(address);
    }

    public static void main(String[] args) {
        Coding std =new Coding("gaurav",45,"Patna");
        std.display();
    }
}
