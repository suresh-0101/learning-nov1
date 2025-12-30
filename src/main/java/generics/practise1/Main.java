package generics.practise1;

public class Main {
    public static void main(String[] args) {

        Pair<String,Integer> pair = new Pair<>("Suresh",23);
        System.out.println(pair.getLeft()+" "+ pair.getRight());

    }
}
