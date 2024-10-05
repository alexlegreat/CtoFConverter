import java.util.Random;
import java.util.Scanner;
public class HigherLow {

    public static void main(String[] args) {


        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(10);
        int guess = -1;

        while (guess!=number) {

            System.out.print("Enter your guess: ");

            guess = scanner.nextInt();

            if (guess<number) {


                System.out.println("Too low");

            } else if (guess>number) {


                System.out.println("Too high");

            } else {


                System.out.println("On the money, correct!! " + number);
            }
        }
    }
}