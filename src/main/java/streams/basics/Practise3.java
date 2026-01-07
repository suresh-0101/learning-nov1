package streams.basics;

import java.util.List;

//Count how many numbers are greater than 5
public class Practise3 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1,2,4,5,3,2,1,7,8,11,13);

        Integer n1 = Math.toIntExact(integers.stream().filter(n -> n >= 5).count());
        System.out.println(n1);

    }
}
