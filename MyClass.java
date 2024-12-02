import java.util.Scanner; // import the Scanner class

public class MyClass {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in); // create a scanner object
        System.out.println("Type a number");
        x = myObj.nextInt(); //Read user input

        System.out.println("Type another number");
        y = myObj.nextInt(); // Read user input

        sum = x + y; // Adding the two numbers
        System.out.println("The sum is: " + sum); // print the sum of x + y
    }
}