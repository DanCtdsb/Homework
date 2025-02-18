import java.util.Scanner;

public class NANDGate {
    public static void main(String[] args) {
        // Ask the user or two boolean variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your a value");
        boolean a = scanner.nextBoolean();
        System.out.println("Please enter your b value");
        boolean b = scanner.nextBoolean();
        
        // NAND output
        System.out.println("Your c value is " + !(a && b));
        scanner.close();

    }
}