import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) {
        // Ask the user or two boolean variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your a value");
        boolean a = scanner.nextBoolean();
        System.out.println("Please enter your b value");
        boolean b = scanner.nextBoolean();
        System.out.println("Please enter your c value");
        boolean c = scanner.nextBoolean();
        System.out.println("Please enter your d value");
        boolean d = scanner.nextBoolean();
        
        // NAND output
        boolean output = ((a && b) || (c && d)) || ((c && a) || (a && d)) || ((b && d) || (b && c));
        System.out.println("Your value is " + output);
        scanner.close();

    }
}