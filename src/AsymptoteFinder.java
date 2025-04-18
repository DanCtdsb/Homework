import java.util.Scanner;

public class AsymptoteFinder {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // Ask user for m and n input
        System.out.println("Enter your m value: ");
        int m = keyboard.nextInt();
        System.out.println("Enter your n value: ");
        int n = keyboard.nextInt();
        if (m == n) {
            System.out.println("The asymptote is horizontal");
        } else if (n > m) {
            System.out.println("The asymptote is the x-axis");
        } else {
            // Switch conditional
            switch (m - n) {
                case 1:
                    System.out.println("The asymptote is linear");
                    break;
                case 2:
                    System.out.println("The asymptote is quadratic");
                    break;
                case 3:
                    System.out.println("The asymptote is cubic");
                    break;
                case 4:
                    System.out.println("The asymptote is quartic");
                    break;
                case 5:
                    System.out.println("The asymptote is quintic");
                    break;
                case 6:
                    System.out.println("The asymptote is sextic");
                    break;
                case 7:
                    System.out.println("The asymptote is septic");
                    break;
                case 8:
                    System.out.println("The asymptote is octic");
                    break;
                case 9:
                    System.out.println("The asymptote is nonic");
                    break;
                case 10:
                    System.out.println("The asymptote is decic");
                    break;
            }
        }
        keyboard.close();
    }
}
