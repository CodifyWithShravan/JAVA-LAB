package Week13;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAndOptionalDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evens = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Evens: " + evens);

        Optional<Integer> maybe = nums.stream().filter(n -> n > 10).findFirst();
        System.out.println("Found >10? " + maybe.orElse(-1));

        // method reference
        List<String> names = Arrays.asList("alice","bob","charlie");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
