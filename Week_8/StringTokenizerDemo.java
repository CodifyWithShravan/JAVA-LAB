package Week_8;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String text = "Java,Python;C++:JavaScript Java";
        StringTokenizer st = new StringTokenizer(text, ",;: ");
        System.out.println("Tokens:");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
