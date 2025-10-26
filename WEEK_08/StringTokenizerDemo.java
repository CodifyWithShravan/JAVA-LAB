package WEEK_08;



import java.util.StringTokenizer;

/**
 * 8c) This program demonstrates the StringTokenizer class.
 * Save this file as: week8/StringTokenizerDemo.java
 */
public class StringTokenizerDemo {

    public static void main(String[] args) {
        System.out.println("--- 8c) StringTokenizer Demo ---");

        // --- Example 1: Using a colon (:) delimiter ---
        String data1 = "Java:is:a:powerful:programming:language";
        System.out.println("\nExample 1: String is \"" + data1 + "\"");
        System.out.println("Delimiter is \":\"");

        StringTokenizer st1 = new StringTokenizer(data1, ":");
        
        System.out.println("Tokens:");
        // hasMoreTokens() checks if there is another token
        while (st1.hasMoreTokens()) {
            // nextToken() retrieves the next token
            System.out.println("> " + st1.nextToken());
        }

        // --- Example 2: Using the default space delimiter ---
        String data2 = "This is a second example";
        System.out.println("\nExample 2: String is \"" + data2 + "\"");
        System.out.println("Delimiter is default (space)");

        // If you don't provide a delimiter, it defaults to " \t\n\r" (whitespace)
        StringTokenizer st2 = new StringTokenizer(data2);
        
        System.out.println("Tokens:");
        while (st2.hasMoreTokens()) {
            System.out.println("> " + st2.nextToken());
        }
        
        // --- Modern Alternative ---
        System.out.println("\n--- Modern Alternative (String.split()) ---");
        String[] tokens = data1.split(":");
        for (String token : tokens) {
            System.out.println("> " + token);
        }
    }
}

