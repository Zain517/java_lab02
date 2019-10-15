class Vehicle{
    public void move()
    {
        System.out.println("MOVE.......................");   
    }
  }
    
  class Car extends Vehicle{
    public void move()
    {
        System.out.println("MOVING CAR.......................");   
    }
  }   
    
  class Bike extends Vehicle{
    public void move()
    {
        System.out.println("MOVING BIKE.......................");   
    }
  }
  
 
  
  public  class task02
  {
    public static void main(String args[]){
        System.out.println("Upcasting");  
  
        Vehicle v = new Vehicle();
        v = new Bike();
        v.move();
        v = new Car();
        v.move();
        
        System.out.println("Downcasting");  
  
        Vehicle v2 = new Bike();
        Bike b = new Bike();
        b=(Bike)v2;
        b.move();
        Vehicle v1 = new Car();
        Car c = new Car();
        c=(Car)v1;
        c.move();



    }
  }
  
  
  