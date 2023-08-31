import java.util.*;
//main class
public class Main {
    public static void main(String[] args) {
        //creates scanner for user input.
        Scanner celctoFeir = new Scanner(System.in);
        //asks the user to input a number for Celsius.
        System.out.println("Enter a degree in Celsius:");

        double celsius = celctoFeir.nextDouble(); // calls the user input and assigns it a variable.

        double fahrenheit = (celsius * 9 / 5) + 32; // formula for fahrenheit
        //prints out the conversion
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

        celctoFeir.close(); // Close the resource.
    }
}
