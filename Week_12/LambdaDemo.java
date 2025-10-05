package Week_12;

import java.util.function.Function;

public class LambdaDemo {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello from lambda");
        r.run();

        Function<String, Integer> len = s -> s.length();
        System.out.println("Length of 'Java': " + len.apply("Java"));
    }
}
