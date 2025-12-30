package generics.practise2;


//Let us create a utility method that takes a Pair as input and returns a Pair with the left and right values
//swapped.
//For example, if the input is a Pair with left value as "Hello" and right value as "World",
//the output should be a Pair with left value as "World" and right value as "Hello".
public class Main {
    public static void main(String[] args) {

        Pair<String,String> pair = new Pair<>("HELLO","WORLD");
        System.out.println(pair.getLeft()+" "+pair.getRight());

        Pair<String,String> newPair = pair.swap(pair);
        System.out.println(newPair.getLeft()+" "+newPair.getRight());

    }
}
