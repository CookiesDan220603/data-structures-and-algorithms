public class AVL{
    Node root;
    public int height(Node x){
        if(x == null)
            return -1;
        return x.height;
    }
    private int checkBalance(Node x){
        return height(x.left) - height(x.right);
    }
    private Node rotateLeft(Node x){
        if(x == null) return null;
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        x.height = 1 + Math.max(height(x.left),height(x.right));
        y.height = 1 + Math.max(height(y.left),height(y.right));
        return y;
    }
    private Node rotateRight(Node x){
        if(x == null) return null;
        Node y = x.left;
        x.right = y.right;
        y.right = x;
        x.height = 1 + Math.max(height(x.left),height(x.right));
        y.height = 1 + Math.max(height(y.left),height(y.right));
        return y;
    }
    private Node rotateLeftRight(Node x){
        if(x == null) return null;
        rotateLeft(x.left);
        return rotateRight(x);
    }
    private Node rotateRightLeft(Node x){
        if(x == null) return null;
        rotateRight(x.right);
        return rotateLeft(x);
    }
    private Node balance(Node x){
        if(checkBalance(x)<-1){
            if(checkBalance(x.right)>0){
                x.right = rotateRight(x.right);
            }
            x= rotateLeft(x);
        }
        else if (checkBalance(x)>1){
            if(checkBalance(x.left)<0){
                x.left = rotateLeft(x.left);
            }
            x= rotateRight(x);
        }
        return x;
    }
    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public Node insert(Node node, int key) {
 
        /* 1.  Perform the normal BST insertion */
        if (node == null)
            return (new Node(key));
 
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
         // Duplicate keys not allowed
        rebalance(node);
        return node;
        
    }
 
    //     /* 2. Update height of this ancestor node */
    //     node.height = 1 + Math.max(height(node.left),height(node.right));
 
    //     /* 3. Get the balance factor of this ancestor
    //           node to check whether this node became
    //           unbalanced */
    //     int balance = checkBalance(node);
 
    //     // If this node becomes unbalanced, then there
    //     // are 4 cases Left Left Case
    //     if (balance > 1 && key < node.left.key)
    //         return rotateRight(node);
 
    //     // Right Right Case
    //     if (balance < -1 && key > node.right.key)
    //         return rotateLeft(node);
 
    //     // Left Right Case
    //     if (balance > 1 && key > node.left.key) {
    //         node.left = rotateLeft(node.left);
    //         return rotateRight(node);
    //     }
 
    //     // Right Left Case
    //     if (balance < -1 && key < node.right.key) {
    //         node.right = rotateRight(node.right);
    //         return rotateLeft(node);
    //     }
 
    //     /* return the (unchanged) node pointer */
    //     return node;
    // }
    private Node rebalance(Node node) {
        int balanceFactor = checkBalance(node);
      
        // Left-heavy?
        if (balanceFactor < -1) {
          if (checkBalance(node.left) <= 0) {    // Case 1
            // Rotate right
            node = rotateRight(node);
          } else {                                // Case 2
            // Rotate left-right
            node.left = rotateLeft(node.left);
            node = rotateRight(node);
          }
        }
      
        // Right-heavy?
        if (balanceFactor > 1) {
          if (checkBalance(node.right) >= 0) {    // Case 3
            // Rotate left
            node = rotateLeft(node);
          } else {                                 // Case 4
            // Rotate right-left
            node.right = rotateRight(node.right);
            node = rotateLeft(node);
          }
        }
      
        return node;
      }
}