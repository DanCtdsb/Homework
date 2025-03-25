import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class ReadWrite {
    public static void main(String[] args) throws IOException{
        FileReader reader = null;
        FileWriter writer = null;
        double sum = 0;
        int counter = 0;
        try {
            reader = new FileReader("numbers.txt");
            double num = reader.read();
            while (reader.read() != -1) {
                counter++;

            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        } finally {
            reader.close();
        }
        writer = new FileWriter("average.txt");
        writer.write("Your average is: " + sum/counter);

        writer.close();


    }


}
