import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class FileIO {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = null;
        FileWriter writer = null;
        double sum = 0;
        int counter = 0;
        String num = null;

        try {
            reader = new BufferedReader(new FileReader("numbers.txt"));
            while ((num = reader.readLine()) != null) {
                sum += Double.parseDouble(num);
                counter++;
            writer = new FileWriter("average.txt", true);
            writer.write("Your average is: " + sum/counter);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Error: File not found");
        } catch (IOException exception) {
            System.out.println("Error: Cannot create/locate file");
        } finally {
            reader.close();
            writer.close();
        }
    }
}
