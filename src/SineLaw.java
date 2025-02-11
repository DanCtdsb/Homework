import java.util.Scanner;

public class SineLaw {
    public static void main(String[] args) {
        // Ask user for two lengths and an angle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter of side length a");
        double side_a = scanner.nextDouble();
        System.out.println("Please enter of side length b");
        double side_b = scanner.nextDouble();
        System.out.println("Please enter of angle a");
        double angle_a = scanner.nextDouble();

        double angle_b = Math.toDegrees(Math.asin(Math.sin(Math.toRadians(angle_a)) * side_b/side_a));
        System.out.println("Your angle b is " + angle_b);
        scanner.close();

    }
}

