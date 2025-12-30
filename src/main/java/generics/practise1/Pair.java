package generics.practise1;

public class Pair <LEFT,RIGHT> {

    public LEFT left;
    public RIGHT right;

    public Pair(){

    }
    public Pair(LEFT left, RIGHT right){
        this.left = left;
        this.right= right;
    }

    public LEFT getLeft() {
        return left;
    }

    public void setLeft(LEFT left) {
        this.left = left;
    }

    public RIGHT getRight() {
        return right;
    }

    public void setRight(RIGHT right) {
        this.right = right;
    }
}
