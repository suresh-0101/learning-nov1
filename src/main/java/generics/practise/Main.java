package generics.practise;

public class Main {
    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Suresh","morningstar");
        System.out.println(pair.getLeft());
        System.out.println(pair.getRight());

        Pair<Integer> pair1 = new Pair<>(10,20);
        System.out.println(pair1.getLeft()+" "+pair1.getRight());

        Pair<Object> pair2 = new Pair<>(new Object(),new Object());
        System.out.println(pair2.getLeft()+" "+pair2.getRight());


    }
}
