import java.util.Scanner;

public class QuadraticFormula {

    public static void quadraticFormula(double a, double b, double c)
    {
        double discriminant = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double root_1 = (-b + discriminant)/(2 * a);
        double root_2 = (-b - discriminant)/(2 * a);
        System.out.println("Root 1:" + root_1);
        System.out.println("Root 2:" + root_2);




    }
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter you a value: ");
        double a = keyboard.nextDouble();
        System.out.println("Enter you b value: ");
        double b = keyboard.nextDouble();
        System.out.println("Enter you c value: ");
        double c = keyboard.nextDouble();

        quadraticFormula(a, b, c);
    }
}
