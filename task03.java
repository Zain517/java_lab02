import java.util.Scanner;

interface StudentData{

  public  void setName(String name);
  public void setRollNumber(int roll);
  public void setCGPA(double gpa); 
  public String getName();
  public int getRollNumber();
  public double getCGPA();
  public void display();

}

class Student implements StudentData{
    String name;
    int rollno;
    double gpa;
    Student()
    {
        this.name=" ";
        this.rollno=0;
        this.gpa=0.0; 
    }
    Student(String name,int rollno,double gpa)
    {
        this.name=name;
        this.rollno=rollno;
        this.gpa=gpa; 
    }
    public  void setName(String name) {this.name=name;}
    public void setRollNumber(int roll){this.rollno=roll;}
    public void setCGPA(double gpa){this.gpa=gpa;} 
    public String getName(){return name;}
    public int getRollNumber(){return rollno;}
    public double getCGPA(){return gpa;}
    public void display()
    {
        System.out.println("Name: " + getName());
        System.out.println("Roll Number " + getRollNumber());
        System.out.println("CGPA " + getCGPA());
    }
}
  
 
  
  public  class task03
  {
    public static void main(String args[]){
        StudentData obj;
        obj= new Student();
        obj.setName("zain");
        obj.setRollNumber(123);
        obj.setCGPA(3.15);
        obj.display();
    }
  }
  
  
  