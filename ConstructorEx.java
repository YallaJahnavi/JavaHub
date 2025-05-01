// Class representing a Car
class Cars {
    String model;
    int year;

    // Parameterized Constructor
    Cars(String m, int y) {
        model = m;
        year = y;
    }

    // Copy Constructor
    Cars(Cars c) {
        this.model = c.model;
        this.year = c.year;
    }

    // Method to display car details
    void display() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}
    public class ConstructorEx{
    public static void main(String[] args) {
        // Creating an object using parameterized constructor
        Cars car1 = new Cars("Toyota", 2022);

        // Creating another object using copy constructor
        Cars car2 = new Cars(car1);

        // Displaying both objects
        System.out.println("Original Car:");
        car1.display();
        
        System.out.println("Copied Car:");
        car2.display();
}
}
