
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle shaperect = new Rectangle();
        System.out.println("Please enter the width of the rectangle ");
        Scanner myinput = new Scanner(System.in);
        double length = myinput.nextDouble();
        shaperect.setLength(length);
        System.out.println("Please enter the width of the rectangle");
        double width = myinput.nextDouble();
        shaperect.setWidth(width);
        System.out.println("You entered " + +shaperect.getWidth());

        Rectangle shaperect2 = new Rectangle();
        System.out.println("Please enter the width of the rectangle ");
        double length2 = myinput.nextDouble();
        System.out.println(shaperect2.getLength());
        System.out.println("Please enter the width of the rectangle");
        double width2 = myinput.nextDouble();
        shaperect2.setWidth(width2);
        System.out.println("You entered " + +shaperect2.getWidth());

        Rectangle shaperect3 = new Rectangle(23,67);
        System.out.println("You entered  for length" + shaperect3.getLength());
        System.out.println("You entered for width " + shaperect3.getWidth());


    }
}
