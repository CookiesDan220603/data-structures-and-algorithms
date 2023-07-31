public class Node{
    int key;
    Node left, right;
    int height;
    public Node(int key){
        this.key = key;
        this.height = 0;
        this.left = this.right = null;
    }
}