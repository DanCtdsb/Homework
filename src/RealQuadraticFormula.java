import java.util.Scanner;

public class RealQuadraticFormula {

    public static void quadraticFormula(double a, double b, double c)
    {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double root_1 = (-b + Math.sqrt(discriminant))/(2 * a);
        if (discriminant > 0){
            double root_2 = -b - Math.sqrt((discriminant))/(2 * a);
            System.out.println("Root 1:" + root_1);
            System.out.println("Root 2:" + root_2);
        }
        else if (discriminant == 0) {
            System.out.println("Your only root is: " + root_1);
        }
        else{
            System.out.println("No real roots");

        }

    }
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your a value: ");
        double a = keyboard.nextDouble();
        System.out.println("Enter your b value: ");
        double b = keyboard.nextDouble();
        System.out.println("Enter your c value: ");
        double c = keyboard.nextDouble();

        quadraticFormula(a, b, c);
        keyboard.close();
    }
}
