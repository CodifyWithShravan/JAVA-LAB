public class ControlStructuresDemo {
    public static void main(String[] args) {
        int score = 75;

        // If-else statement
        System.out.println("If-else Demo:");
        if (score >= 60) {
            System.out.println("You passed the exam!");
        } else {
            System.out.println("You did not pass the exam.");
        }

        // For loop
        System.out.println("\nFor Loop Demo:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // While loop
        System.out.println("\nWhile Loop Demo:");
        int j = 0;
        while (j < 3) {
            System.out.println("While count: " + j);
            j++;
        }

        // Do-while loop
        System.out.println("\nDo-While Loop Demo:");
        int k = 0;
        do {
            System.out.println("Do-While count: " + k);
            k++;
        } while (k < 3);

        // Switch statement
        System.out.println("\nSwitch Statement Demo:");
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Very Good!");
                break;
            case 'C':
                System.out.println("Good!");
                break;
            default:
                System.out.println("Needs improvement.");
        }
    }
}