import java.util.Scanner;

public class PolynomialFunction {
    public static void main(String[] args) {
        // Ask the user for the n value
        Scanner keyboard = new Scanner(System.in);
        double result = 0;

        System.out.println("Please enter your coefficients(seperated by space): ");
        String[] coefficients = keyboard.nextLine().split(" ");

        System.out.println("Please enter your exponents(seperated by space): ");
        String[] exponents = keyboard.nextLine().split(" ");

        System.out.println("Please enter your x value: ");
        int x = keyboard.nextInt();

        System.out.print("Your function: f(x)=");
        String function = "f(x)= ";
        for (int i = 0; i < coefficients.length; i++) {
            function += ((Double.parseDouble(coefficients[i]) >= 0 && i != 0) ? " +" : " ") + coefficients[i] + "x^" + exponents[i];
        }
        System.out.println("Function: " + function);
        for (int i = 0; i < coefficients.length; i++) {
            result += Double.parseDouble(coefficients[i]) * Math.pow(x, Integer.parseInt(exponents[i]));
        }

        System.out.println("f(" + x + ")= " + result);

        // Loop through each token
        keyboard.close();
    }
}
