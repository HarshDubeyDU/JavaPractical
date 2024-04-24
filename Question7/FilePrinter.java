package Question7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrinter {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("Hello.txt")) {
            BufferedReader reader = new BufferedReader(fileReader);
            PrintWriter out = new PrintWriter(System.out);
            String fileContent;
            while ((fileContent = reader.readLine()) != null && fileContent.startsWith("//")) {
                out.println(fileContent);
            }
            reader.close();
            out.close();
        } catch (IOException e) {
            System.out.println("File does not exists.");
        }
    }
}
