import java.util.ArrayList;

public class Node {
    public int val;
    ArrayList<Node> children;

    private Node() {}

    public Node(int val){
        this.val = val;
    }

    public void addChild(Node child){
        this.children.add(child);
    }
}
