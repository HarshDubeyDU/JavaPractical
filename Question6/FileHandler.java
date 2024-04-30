package Question6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("File 1: ");
        String fileOneName = sc.next();
        System.out.print("File 2: ");
        String fileTwoName = sc.next();
        try {
            FileReader fileOne = new FileReader(fileOneName);
            File fileTwo = new File(fileTwoName);
            BufferedReader fileReader = new BufferedReader(fileOne);
            PrintWriter fileWriter = new PrintWriter(fileTwo);
            String fileContent;
            while ((fileContent = fileReader.readLine()) != null) {
                fileWriter.println(fileContent);
            }
            fileOne.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(fileOneName + " was not found.");
        }
        sc.close();
    }
}