import java.util.Scanner;

public class Casting {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in); // Initialize Scanner
        System.out.print("Enter a decimal: ");

        // Ask for user input(decimal) and cast into integer
        int input = (int) scanner.nextDouble();

        System.out.print("Your input as an integer is: " + input); // Print out input as integer

        scanner.close(); // Close scanner
    }
}
