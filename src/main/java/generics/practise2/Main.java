package generics.practise2;


//Let us create a utility method that takes a Pair as input and returns a Pair with the left and right values
//swapped.
//For example, if the input is a Pair with left value as "Hello" and right value as "World",
//the output should be a Pair with left value as "World" and right value as "Hello".
public class Main {
    public static void main(String[] args) {


        Pair<String,String> pair = new Pair<>("HELLO","WORLD");
        System.out.println(pair.getLeft()+" "+pair.getRight());

        // Here we don't need to pass the Pair object as a parameter
        // because this is an instance method.
        // The method can access left and right directly using `this`.
        // Instance method → for object-oriented usage
        Pair<String, String> newPair = pair.swap();

        // The below code uses a STATIC swap method.
        // Static methods are used for generic utility purposes.
        // Since the swap logic does NOT use the state of any Pair object (`this`),
        // passing the Pair object as a parameter is required.
        // Calling swap as a static method avoids wasting an instance method call
        // that does not use the object’s state.
        Pair<String, Integer> pair1 = new Pair<>("HELLO", 25);
        Pair<Integer, String> newPair1 = Pair.swap(pair1);
        System.out.println(newPair1.getLeft() + " " + newPair1.getRight());


    }
}
