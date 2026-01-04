package generics.practise2;

public class Pair <LEFT,RIGHT>{
    public LEFT left;
    public RIGHT right;

    public Pair(LEFT left, RIGHT right)
    {
        this.left = left;
        this.right = right;
    }

    public Pair<RIGHT, LEFT> swap() {
        return new Pair<>(this.right, this.left);
    }

    public static <LEFT,RIGHT> Pair<RIGHT,LEFT> swap (Pair<LEFT,RIGHT> pair)
    {
        return new Pair<>(pair.getRight(), pair.getLeft());
    }

    public LEFT getLeft()
    {
        return left;
    }

    public void setLeft(LEFT left) {
        this.left = left;
    }

    public RIGHT getRight()
    {
        return right;
    }

    public void setRight(RIGHT right)
    {
        this.right = right;
    }
}
