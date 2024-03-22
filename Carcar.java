import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Carcar implements Serializable {
  private String make;
  private int year;
  private static final long serialVersionUID = 1L;

  public Car(String make, int year) {
    this.make = make;
    this.year = year;
  }

  public String toString(){
    return String.format("Car make is: %s, Car year is: %d", this.make, this.year);
  }

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    Car toyota = new Car("Toyota", 2021);
    Car honda = new Car("Honda", 2020);
    FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(toyota);
    objectOutputStream.writeObject(honda);
    FileInputStream fileInputStream = new FileInputStream("cars.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Car toyotaCopy = (Car)objectInputStream.readObject();
    Car hondaCopy = (Car)objectInputStream.readObject();
    boolean isSameObject = toyotaCopy == toyota;
    System.out.println(toyotaCopy);
    System.out.println(toyota);
    System.out.println(isSameObject);
  }
}
