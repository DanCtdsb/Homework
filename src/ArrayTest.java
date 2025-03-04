import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in); // Initialize Scanner
        String[] inputs = new String[10];

        program:
        while (true) {
            System.out.println("--------------------------------------------------"); 
            System.out.println("Please enter a selection: "); 
            System.out.println("1) Input 10 strings into the array"); 
            System.out.println("2) Print entire array"); 
            System.out.println("3) Print value of a specific index in the array"); 
            System.out.println("4) Exit the program"); 

            switch (keyboard.nextLine()) {
                case "1":
                    for (int i = 0; i < inputs.length; i++) {
                        System.out.println("Please enter your next value: ");
                        inputs[i] = keyboard.nextLine();
                    }
                    break;
                case "2":
                    for (int i = 0; i < inputs.length; i++) {
                        System.out.println("String #(" + i + 1 + ") = " + inputs[i]); 
                    }
                    break;
                case "3":
                    System.out.println("Please enter a specific index: "); 

                    int index = Integer.parseInt(keyboard.nextLine());
                    System.out.println("Your value at " + index + " is " + inputs[index]); 
                    break;
                case "4":
                    break program;
                default:
                    System.out.println("Invalid Option"); 

            }
        }

        keyboard.close(); // Close scanner
    }
}
