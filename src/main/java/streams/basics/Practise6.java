package streams.basics;

import java.util.Arrays;
import java.util.List;

//sort names
public class Practise6 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Arun", "Suresh", "Anand", "Vijay", "Ajith");

        names.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
