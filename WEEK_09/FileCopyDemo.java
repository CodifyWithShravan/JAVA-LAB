package WEEK_09;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 9a) This program demonstrates copying the contents of one file to another
 * using FileInputStream (for reading bytes) and FileOutputStream (for writing bytes).
 */
public class FileCopyDemo {

    public static void main(String[] args) {
        
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // --- Step 1: Create a source file with some content ---
        // We use FileWriter here for simplicity to create the text file.
        try (FileWriter writer = new FileWriter(sourceFile)) {
            writer.write("This is the source file for Week 9a.\n");
            writer.write("We will copy this content using byte streams.\n");
            writer.write("Hello, World!");
            System.out.println("Created " + sourceFile + " with initial content.");
        } catch (IOException e) {
            System.err.println("Error creating source file: " + e.getMessage());
            return; // Exit if we can't even create the source
        }

        // --- Step 2: Copy the file using byte streams ---
        // We use the "try-with-resources" statement.
        // This automatically closes the streams (fis and fos) when the
        // try block is finished, even if an error occurs.
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            
            int byteRead; // A variable to hold one byte of data (as an int)

            System.out.println("Starting file copy from " + sourceFile + " to " + destinationFile + "...");

            // The read() method returns the next byte of data, or -1
            // if the end of the file is reached.
            while ((byteRead = fis.read()) != -1) {
                // Write the single byte to the destination file
                fos.write(byteRead);
            }

            System.out.println("File copy successful!");

        } catch (IOException e) {
            System.err.println("An error occurred during the file copy: " + e.getMessage());
        }
    }
}

