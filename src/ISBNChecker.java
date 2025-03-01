import java.util.Scanner;

public class ISBNChecker {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your a value: ");
        String code = keyboard.nextLine();
        int len = code.length();
        int sum = 0;

        if (len == 13) {
            for (int i = 0; i < len; i++) {
                int digit = code.charAt(i) - '0';
                sum += (i % 2 == 0) ? digit : digit * 3;
            }
        } 
        
        if (sum % 10 == 0 && sum != 0) {
            System.out.println("Valid ISBN");
        } else {
            System.out.println("Invalid ISBN");
        }
        keyboard.close();
    } 
}
