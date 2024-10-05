import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        double height = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of the rectangle: ");
        if (in.hasNextDouble()) {
            height = in.nextDouble();
            in.nextLine();
            System.out.println("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
            area = height * width;
            perimeter = (width * 2) + (height * 2);
            diagonal = Math.sqrt((width * width) + (height * height));
                System.out.println("The area of the rectangle is " + area);
                System.out.println("The perimeter of the rectangle is " + perimeter);
                System.out.println("The diagonal of the rectangle is " + diagonal);

            }
        }
    }
}

