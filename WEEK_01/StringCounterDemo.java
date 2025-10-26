package WEEK_01;

import java.util.Scanner;

/**
 * 1c) This program inputs a string and counts the number of
 * vowels, consonants, digits, and special characters.
 */
public class StringCounterDemo {

    public static void main(String[] args) {
        System.out.println("--- 1c) String Character Counter ---");

        // 1. Get input string from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string (e.g., 'Hello World 123!'):");
        String input = scanner.nextLine();

        // 2. Initialize counters
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialChars = 0;

        // 3. Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            
            // Get the character at the current position
            char ch = input.charAt(i);

            // 4. Categorize the character
            
            // First, check for letters
            if (Character.isLetter(ch)) {
                // Convert to lowercase to make checking easier
                ch = Character.toLowerCase(ch);
                
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } 
            // Second, check for digits
            else if (Character.isDigit(ch)) {
                digits++;
            } 
            // Finally, everything else is a special character (including spaces)
            else {
                specialChars++;
            }
        }

        // 5. Display the results
        System.out.println("\n--- Results for: '" + input + "' ---");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters (incl. spaces): " + specialChars);
    }
}

