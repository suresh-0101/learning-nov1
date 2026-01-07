package streams.basics;

import java.util.Arrays;
import java.util.List;

public class Practise2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> numbers1 = numbers.stream()
                                        .map(n-> n*n)
                                        .toList();
        System.out.println(numbers1);

    }
}
