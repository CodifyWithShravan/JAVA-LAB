package Week_9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Week9.FileCopyDemo <source> <destination>");
            return;
        }
        String src = args[0];
        String dst = args[1];

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dst)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Copy completed.");
        } catch (IOException e) {
            System.err.println("I/O Error: " + e.getMessage());
        }
    }
}
