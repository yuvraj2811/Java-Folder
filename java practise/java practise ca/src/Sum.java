public class Sum {
    int num;
    int num2;
    int num3;
    int num4;

    void sumResult(int num,int num2){
        System.out.println(num+num2);
    }

    void sumResult(int num, int num2,int num3){
        System.out.println(num+num2+num3);
    }

    void sum(){
        System.out.println("Parent class");
    }

}

class Sum2 extends Sum{
   @Override
    void sum(){
        System.out.println("Child class");
    }
    public static void main(String[] args) {
        Sum2 add= new Sum2();
        add.sum();
        add.sumResult(5,3);
    }
}