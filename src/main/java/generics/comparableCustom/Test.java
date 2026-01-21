package generics.comparableCustom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(180, 120));
        cars.add(new Car(220, 150));
        cars.add(new Car(160, 100));
        cars.add(new Car(200, 130));

        System.out.println("Before sorting:");
        cars.forEach(System.out::println);

        Collections.sort(cars);

        System.out.println("\nAfter sorting by speed:");
        cars.forEach(System.out::println);
    }
}
