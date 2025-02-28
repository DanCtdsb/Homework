import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your a value: ");
        String code = keyboard.nextLine();
        int len = code.length();

        if (len == 13) {
            int sum = 0;
            for (int i = 0; i < len; i++) {
                System.out.println(sum);
                int digit = (int) code.charAt(i);
                System.out.println(digit);

                if (i % 2 == 0) {
                    sum += digit;
                } else {
                    sum += digit * 3;
                }
            }
            if (sum % 10 == 0) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        keyboard.close();
    } 
}
