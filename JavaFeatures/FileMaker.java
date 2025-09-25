package JavaFeatures;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMaker {
    public static void main(String[] args) {
        String fileName = "table.txt";
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))){
            String[] headers = {"ID", "Name", "Age"};

            // Print headers
            writer.printf("%-10s %-15s %-5s%n", headers[0], headers[1], headers[2]);
            writer.println("--------------------------------------");

            // Add some rows
            writer.printf("%-10s %-15s %-5d%n", "1", "Ashutosh", 23);
            writer.printf("%-10s %-15s %-5d%n", "2", "Rohit", 28);
            writer.printf("%-10s %-15s %-5d%n", "3", "Ananya", 25);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
