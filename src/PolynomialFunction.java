import java.util.Scanner;
import java.util.StringTokenizer;


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

        System.out.print("Your function: f(x)= ");
        String isNegative = " ";
        for (int i = 0; i < coefficients.length; i++) {
            if (i != 1) {
                isNegative = (Double.parseDouble(coefficients[i]) >= 0) ? " +" : " ";

            }
            System.out.print(isNegative + coefficients[i] + "x^" + exponents[i]);
        }
        System.out.println("");
        for (int i = 0; i < coefficients.length; i++) {
            result += Double.parseDouble(coefficients[i]) * Math.pow(x, Integer.parseInt(exponents[i]));
        }

        System.out.println("f(" + x + ")= " + result);

        // Loop through each token
       
        keyboard.close();
    }
}
