// Class definition
class Car {
    // Data members (fields)
    String make;
    String model;
    int year;
    double price;

    // Constructor
    public Car(String make, String model, int year, double price) {
        this.make = make;  // 'this' refers to the current object's instance
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Member function (method) to display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    // Member function (method) to calculate discounted price
    public double getDiscountedPrice(double discountPercent) {
        return price - (price * discountPercent / 100);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects (instances) of the Car class
        Car car1 = new Car("Toyota", "Corolla", 2021, 20000);
        Car car2 = new Car("Honda", "Civic", 2020, 22000);

        // Calling member functions on the objects
        car1.displayDetails();
        System.out.println("Discounted Price: $" + car1.getDiscountedPrice(10));
        System.out.println();

        car2.displayDetails();
        System.out.println("Discounted Price: $" + car2.getDiscountedPrice(15));
    }
}