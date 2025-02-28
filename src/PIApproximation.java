import java.util.Scanner;

public class PIApproximation {
    public static void main(String[] args) {
        // Ask the user for the n value
        Scanner scanner = new Scanner(System.in);
        char input;
        // Do the following once, and continue as long as input is y
        do {
            System.out.println("Please enter your n value");
            int n = scanner.nextInt();
            double sum = 0;

            // Calculate the PIApproximation using a for loop
            for (int i = 0; i <= n; i++) {
                sum += Math.pow(-1, i) / (2 * i + 1);
            }

            // Print out the PIApporximation
            System.out.println("Your PI approximation is " + 4 * sum);
            System.out.println("Do you want to try again?");
            input = scanner.next().toLowerCase().charAt(0);
        } while (input == 'y');
        scanner.close();
    }
}
