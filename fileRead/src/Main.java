import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String str ="test.txt"; // insert the file path in the quotes
        File file = new File(str); // file object constructor passing the file path
        try (Scanner scanner = new Scanner(file)) { // try to pass file to scanner class to handle the content
            while (scanner.hasNext()) { // loop as long as the file has content
                System.out.println(scanner.nextLine()); // printing the content in each line
            }
        } catch (FileNotFoundException e) { // handle the exception for not found file
            System.out.println("No file found: " + str);
        }
    }
}