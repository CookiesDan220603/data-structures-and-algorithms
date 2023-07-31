public class AVL {
    public int height(Node node){
        if(node==null)
          return -1;
        return node.height;
    }
    public int checkBalance(Node x){
        return height(x.left)-height(x.right);
    }
    public Node balance(Node x) {
        if (checkBalance(x) < -1) {
            if (checkBalance(x.right) > 0) {
                x.right = rotateRight(x.right);
            }
            x = rotateLeft(x);
        }
        else if (checkBalance(x) > 1) {
            if (checkBalance(x.left) < 0) {
                x.left = rotateLeft(x.left);
            }
            x = rotateRight(x);
        }
        return x;
    }
    public Node rotateLeft(Node x){
        if(x==null) return null;
        Node y=x.right;
        x.right=y.left;
        y.left=x;
        x.height=1+Math.max(height(x.left),height(x.right));
        y.height=1+Math.max(height(y.left),height(y.right));
        return y;
    }
    public Node rotateRight(Node x){
        if(x==null) return null;
        Node y=x.left;
        x.left=y.right;
        y.right=x;
        x.height=1+Math.max(height(x.left),height(x.right));
        y.height=1+Math.max(height(y.left),height(y.right));
        return y;
    }
    public Node rotateLR(Node x){
        if(x==null) return null;
        rotateLeft(x.left);
        return rotateRight(x);
    }
    public Node rotaNodeRL(Node x){
        if(x==null) return null;
        rotateRight(x.right);
        return rotateLeft(x);
    }
}
