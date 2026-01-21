package generics.IteratorCustom;

import java.util.Iterator;

class Node implements Iterable<Integer> {
    public int data;
    public Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public Iterator<Integer> iterator(){
        return new NodeIterator(this);
    }
    //inner class to iterate over the node elements
    class NodeIterator implements Iterator<Integer>{
        Node head;
        public NodeIterator(Node node){
            this.head = node;
        }
        //hasNext method to check next element is not null
        public boolean hasNext(){
            return this.head != null;
        }
        //next method to return the int data
        public Integer next(){
            Node temp = head;
            head = head.next;
            return temp.data;
        }

    }
}