import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args) {
        double fahrenheit = 0;
        double celsius = 0;
        String trash = "";
        boolean Celf = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius ");
        do {

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                fahrenheit = celsius * 1.8 + 32;
                System.out.println(" The temperature in Fahrenheit is %.2f " + fahrenheit);
                Celf = true;
            } else {
                trash = in.nextLine();
                System.out.println("Please enter a valid number ");
            }

        }while (!Celf);;
    }
}