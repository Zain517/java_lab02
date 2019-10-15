
abstract class Shape{

  double area;
  double volume;

// public Shape()
// {
//   this.area=0.0;
//   this.volume=0.0;
// }
// public Shape(  double area ,  double volume)
// {
//   this.area=area;
//   this.volume=volume;
// }
  public abstract void calculateArea();
  
  public abstract void calculateVolume();
  
  public String toString()
  {   
      return "Area is "+ area + " & Volume is "+volume;
  }
}
  
  
  
class Square extends Shape
{

  double width;
  double length;
  double height;

    public Square( double width,double length,double height)
    {
    this.width=width;
    this.length=length;
    this.height=height;
    }

    public void calculateArea()
    { 
      System.out.println("Area of SQUARE: " + length*width);
    }

    public void calculateVolume()
    { 
      System.out.println("Area of SQUARE: " + length*width*height);
    }

}

class Sphere extends Shape
{

  double r;
  final double PI=3.14;
  

    public Sphere( double radius)
    {
    this.r=radius;
    }

    public void calculateArea()
    { 
      System.out.println("Area of SPHERE: " + PI*r*r);
    }

    public void calculateVolume()
    { 
      System.out.println("volume of SPHERE: " + PI*r*r*r);
    }

}


public  class task01
{
  public static void main(String args[]){
Shape s;
System.out.println(" SQUARE: ");
s = new Square(5,6,7);
s.calculateArea();
s.calculateVolume();
System.out.println(" SPHERE: ");
s = new Sphere(5);
s.calculateArea();
s.calculateVolume();

System.out.println(s);



  }
}


