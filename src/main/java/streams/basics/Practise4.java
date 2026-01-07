package streams.basics;

import java.util.Arrays;
import java.util.List;

//Names Starting With A
public class Practise4 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Arun", "Suresh", "Anand", "Vijay", "Ajith");

        List<String> result = names.stream()
                                .filter(name-> name.startsWith("A"))
                                .toList();

        System.out.println(result);


    }
}
