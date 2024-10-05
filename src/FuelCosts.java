import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;


        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                if (gallons < 0) {
                    System.out.println("Please enter a non-negative value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
        } while (gallons < 0);


        do {
            System.out.print("Enter the fuel efficiency in miles per gallon (mpg): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                if (mpg <= 0) {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
        } while (mpg <= 0);


        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                if (pricePerGallon < 0) {
                    System.out.println("Please enter a non-negative value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
        } while (pricePerGallon < 0);


        double costToDrive100Miles = (100.0 / mpg) * pricePerGallon;


        double distanceWithFullTank = gallons * mpg;


        System.out.printf("Cost to drive 100 miles: $%.2f%n", costToDrive100Miles);
        System.out.printf("Distance with a full tank: %.2f miles%n", distanceWithFullTank);

        in.close();
    }
}