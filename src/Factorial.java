import java.util.Scanner;

public class Factorial {
    public static int factorial(int term) { 
        if (term < 1) {
            return 1;
        } else {
            return (factorial(term - 1) * term);
        }
    }
    public static void main(String[] args) throws Exception { 
        System.out.println("Result: " + factorial(5));
    }
}