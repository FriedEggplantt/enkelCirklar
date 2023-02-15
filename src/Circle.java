import java.io.IOException;
import java.util.Scanner;
public class Circle {
    double radius = 1;

    public Circle() {
        welcome();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double getArea() {
        double Area = radius * radius * Math.PI;
        return Area;
    }

    public double getCircumference() {
        double Circumference = 2 * radius * Math.PI;
        return Circumference;
    }

    public void tostring() {

    }

    public void welcome() {
        System.out.println("How many circles do you want to create?: ");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        System.out.println("What radius do the circles have?");
        while (true) {
            try {
                radius = input.nextDouble();
                break;
            }
            catch(Exception e){
                System.out.println("Invalid input, radius is set to 1");

                setRadius(1.0);
                break;
            }
            }
        System.out.println("This is your circle(s):");
        System.out.println("___________________");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
        }
    }




