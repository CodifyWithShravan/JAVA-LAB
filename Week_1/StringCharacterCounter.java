
import java.util.Scanner;

/**
 * Week 1c: Count vowels, consonants, digits, and special characters
 */
public class StringCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int vowels = 0, consonants = 0, digits = 0, special = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.toLowerCase().charAt(i);
            
            if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch != ' ') {
                special++;
            }
        }
        
        System.out.println("\nResults:");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + special);
        
        scanner.close();
    }
}
