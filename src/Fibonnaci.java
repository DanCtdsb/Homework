import java.util.Scanner;

public class Fibonaci {
    public static int factorial(int term) { 
        if (term == 1) {
            return 0;
        } else if (term == 2) {
            return 1;
        } else {
            return (factorial(term - 1) + factorial(term - 2));
        }
    }
    public static void main(String[] args) throws Exception { 
        System.out.println("Result: " + factorial(5));
    }
}