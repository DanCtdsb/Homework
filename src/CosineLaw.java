import java.util.Scanner;

public class CosineLaw {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter of side length a");
        double side_a = scanner.nextDouble();
        System.out.println("Please enter of side length b");
        double side_b = scanner.nextDouble();
        System.out.println("Please enter of angle a");
        double angle_c = scanner.nextDouble();

        double side_c = Math.sqrt(side_a * side_a + side_b * side_b - 2 * side_a * side_b * (Math.cos(Math.toRadians(angle_c))));
        System.out.println("Your side c is " + side_c);
        scanner.close();
    }
}
