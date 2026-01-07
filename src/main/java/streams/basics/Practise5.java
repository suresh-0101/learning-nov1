package streams.basics;

import java.util.Arrays;
import java.util.List;

//Uppercase Conversion
public class Practise5 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arun", "Suresh", "Anand", "Vijay", "Ajith");

        List<String> result = names.stream()
                .map(name-> name.toUpperCase())
                .toList();

        System.out.println(result);

    }
}
