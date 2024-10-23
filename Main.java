abstract class Vehicle{
  private String brand;
  private String model;

  // Constructor
  public Vehicle(String brand, String model){
    this.brand = brand;
    this.model = model;
  }
  // Getter for brand
  public String getBrand(){
    return brand;
  }

  public void setBrand(String brand){
    this.brand = brand;
  }

  public String getModel(){
    return model;
  }

  public void setModel(String model){
    this.model = model;  
  }

  public abstract void start();

  public abstract void stop();
}

class Car extends Vehicle{
  private int doors;

  public Car(String brand, String model, int doors){
    super(brand, model);
    this.doors = doors;
  }

  public int getDoors(){
    return doors;
  }

  @Override
  public void start(){
    System.out.println("The car " + getBrand() + " " + getModel() + " is start    ing." );
  }

  @Override
  public void stop(){
    System.out.println("The car " + getBrand() + " " + getModel() + " is stopp    ing." );
  }

}

class Bike extends Vehicle{
  private boolean hasCarrier;

  public Bike(String brand, String model, boolean hasCarrier){
  super(brand, model);
    this.hasCarrier = hasCarrier;
  }

  public boolean hasCarrier(){
    return hasCarrier;
  }

  public void setCarrier(boolean hasCarrier){
    this.hasCarrier = hasCarrier;
  }

  @Override
  public void start(){
    System.out.println("The bike " + getBrand() + " " + getModel() + " is start    ing." );
  }
  @Override
  public void stop(){
    System.out.println("The bike " + getBrand() + " " + getModel() + " is stoping");
  }


}


public class Main{
  public static void main(String[] args){
    Car car = new Car("Toyota", "Camry",4);
    car.start();
    car.stop();

    System.out.println("Car has " + car.getDoors() + " doors.");

    Bike bike  = new Bike("Yamaha", "FZ", true);
    bike.start();
    bike.stop();
    System.out.println("Bike has carrier: " + bike.hasCarrier());
  }
}



