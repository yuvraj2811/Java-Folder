import java.util.Arrays;

public class Student {

  private  String name;
  private int roll;
  private int[] marks;

 public Student(String name,int roll){

     this.name=name;
     this.roll=roll;
  }

  public void setMarks(int[] marks){

     for (int mark : marks){
         if (mark<0||mark>100){
             System.out.println("Invalid marks , "+mark);
             return;
         }
     }
     this.marks=marks;
  }
  public double calculateAverage(){
     if (marks==null||marks.length==0){
         return  0;
     }
     int sum = 0;
     for (int mark:marks) {
         sum=sum+mark;
     }
     double average = sum/marks.length;
     return average;
  }

  public String determineGrade(){
     double average = calculateAverage();
     if (average>=90){return "A";}
     else if (average>=80) {return "B";}
     else if (average>=70) {return "C";}
     else if (average>=60) {return "D";}
     else {return "F";}
     }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public int[] getMarks() {
        return marks;
    }

    public String toString(){
     return " Name "+name+"\n Roll number "+roll+"\n Subject marks "+Arrays.toString(marks)+"  \nGrade "+determineGrade();
    }
}
class Details{

    public static void main(String[] args) {
        Student student1 =new Student("gaurav",21);
        int[] marks={98,78,95,77,89};
        student1.setMarks(marks);
        System.out.println(student1);
    }
}