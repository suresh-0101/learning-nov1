package generics.IteratorCustom;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Node node = new Node(3);
        node.next = new Node(4);
        node.next.next = new Node(6);
        node.next.next.next= new Node(7);

       Iterator<Integer> iterator =  node.iterator();

       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }

    }
}
