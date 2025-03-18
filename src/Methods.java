import java.util.Scanner;

public class Methods {

    public static double[] quadraticFormula(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        return new double[] {
            (-b + Math.sqrt(discriminant))/(2 * a),
            (b - Math.sqrt((discriminant))/(2 * a))
        };
    }
    public static double pIApproximation(int n) {
        double sum = 0; 
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(-1, i) / (2 * i + 1);
        }
        return sum;
    }
    public static void aSymptoteFinder(int m, int n) {
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
    }
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        char input;
        do {
            System.out.println("--------------------------------------------------"); 
            System.out.println("Please enter a selection: "); 
            System.out.println("1) Quadratic Formula"); 
            System.out.println("2) PIApproximation"); 
            System.out.println("3) Asymptote Finder"); 
            int choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter your a value: ");
                    double a = keyboard.nextDouble();
                    System.out.println("Enter your b value: ");
                    double b = keyboard.nextDouble();
                    System.out.println("Enter your c value: ");
                    double c = keyboard.nextDouble();

                    double discriminant = Math.pow(b, 2) - 4 * a * c;
                    double[] roots = quadraticFormula(a, b, c);
                    if (discriminant > 0){
            
                        System.out.println("Root 1:" + roots[0]);
                        System.out.println("Root 2:" + roots[1]);
                    }
                    else if (discriminant == 0) {
                        System.out.println("Your only root is: " + roots[0]);
                    }
                    else{
                        System.out.println("No real roots");
            
                    }
                    break;
                case 2:
                    char choices;
                    do {
                    // Do the following once, and continue as long as input is y
                        System.out.println("Please enter your n value");
                        int n = keyboard.nextInt();

                        // Calculate the PIApproximation using a for loop
                        double sum = pIApproximation(n);
                        // Print out the PIApporximation
                        System.out.println("Your PI approximation is " + 4 * sum);
                        System.out.println("Do you want to try again?");
                        choices = keyboard.next().toLowerCase().charAt(0);
                    } while (choices == 'y');
                    break;
                case 3:
                    System.out.println("Enter your m value: ");
                    int m = keyboard.nextInt();
                    System.out.println("Enter your n value: ");
                    int n = keyboard.nextInt();
                    aSymptoteFinder(m, n);
                    break;
            }
            System.out.println("Do you want to continue?");
            input = keyboard.next().toLowerCase().charAt(0);
        } while (input == 'y');
        
        keyboard.close();
    }
}

