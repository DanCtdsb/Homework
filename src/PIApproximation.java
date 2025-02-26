import java.util.Scanner;

public class PIApproximation {
    public static void main(String[] args) {
        // Ask the user for the n value
        Scanner scanner = new Scanner(System.in);
        char input;
        // 
        do {
            System.out.println("Please enter your n value");
            int n = scanner.nextInt();
            double sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += Math.pow(-1, i) / (2 * i + 1);
            }
            System.out.println("Your PI approximation is " + 4 * sum);
            System.out.println("Do you want to try again?");
            input = scanner.next().toLowerCase().charAt(0);
        } while (input == 'y' );
        scanner.close();

    }
}
