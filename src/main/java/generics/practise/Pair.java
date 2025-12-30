package generics.practise;

public class Pair <TYPE>{
    public TYPE left;
    public TYPE right;

    Pair(){

    }

    Pair(TYPE left, TYPE right){
        this.left = left;
        this.right = right;
    }

    public TYPE getLeft() {
        return left;
    }

    public void setLeft(TYPE left) {
        this.left = left;
    }

    public TYPE getRight() {
        return right;
    }

    public void setRight(TYPE right) {
        this.right = right;
    }
}
