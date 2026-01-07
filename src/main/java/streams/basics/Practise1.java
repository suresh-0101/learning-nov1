package streams.basics;

import java.util.Arrays;
import java.util.List;

public class Practise1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream().filter(integer -> integer%2 == 0 ).forEach(n-> {
            System.out.print(n+" ");
        });
        System.out.println();

        List<Integer> numbers1 = numbers.stream().filter(integer -> integer %2 ==0 ).toList();
        System.out.println(numbers1);


    }
}
