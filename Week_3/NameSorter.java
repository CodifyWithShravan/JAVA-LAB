package Week_3;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Week 3b: Sort names in ascending order
 */
public class NameSorter {
    
    // Bubble sort implementation
    public static void bubbleSort(String[] names) {
        int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }
    
    public static void displayNames(String[] names, String title) {
        System.out.println("\n" + title);
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        String[] names = new String[n];
        
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine().trim();
        }
        
        displayNames(names, "Original Names:");
        
        // Sort using bubble sort
        String[] bubbleSorted = Arrays.copyOf(names, names.length);
        bubbleSort(bubbleSorted);
        displayNames(bubbleSorted, "Bubble Sorted Names:");
        
        // Sort using Arrays.sort()
        String[] arraysSorted = Arrays.copyOf(names, names.length);
        Arrays.sort(arraysSorted, String.CASE_INSENSITIVE_ORDER);
        displayNames(arraysSorted, "Arrays.sort() Result:");
        
        scanner.close();
    }
}
