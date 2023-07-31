public class BST {
    Node root;

    public BST() {
        root = null;
    }

    public Node insert(Node x, Integer key) {
        if (x == null) {
            return new Node(key);
        }
        if (key < x.key) {
            x.left = insert(x.left, key);
        } else if (key > x.key) {
            x.right = insert(x.right, key);
        } else {
            x.key = key;
        }
        return x;
    }

    public void NLR(Node x) {
        if (x != null) {
            System.out.print(x.key + " ");
            NLR(x.left);
            NLR(x.right);
        }
    }

    public void LNR(Node x) {
        if (x != null) {
            LNR(x.left);
            System.out.print(x.key + " ");
            LNR(x.right);
        }
    }

    public void LRN(Node x) {
        if (x != null) {
            LRN(x.left);
            LRN(x.right);
            System.out.print(x.key + " ");
        }
    }

    public Node search(Node x, Integer key) {
        if (x == null) {
            return null;
        }
        if (key < x.key) {
            return search(x.left, key);
        } else if (key > x.key) {
            return search(x.right, key);
        } else
            return x;
    }

    public Node min(Node x) {
        if (x.left == null) {
            return x;
        } else
            return min(x.left);
    }

    public Node max(Node x) {
        if (x.right == null) {
            return x;
        } else
            return max(x.right);
    }

    public Node deleteMin(Node x) {
        if (x.left == null) {
            return x.right;
        }
        x.left = deleteMin(x.left);
        return x;
    }
    public Node findLeftNode(Node root){
        if(root == null) return null;
        Node leftMostNode = root;
        while(leftMostNode.left != null){
            leftMostNode= leftMostNode.left;
        }
        return leftMostNode;
    }
    public Node delete(Node x, Integer key) {
        if (x == null)
            return null;
        if (key < x.key) {
            x.left = delete(x.left, key);
        } else if (key > x.key) {
            x.right = delete(x.right, key);
        } else {
            if(x.right == null && x.left == null){
                return null;
            }
            if (x.right == null && x.left != null) {
                return x.left;
            }
            if (x.left == null  && x.right != null) {
                return x.right;
            }
            Node leftMostNode = findLeftNode(x.right);
            x.key = leftMostNode.key;
            x.right = delete(x.right, leftMostNode.key);
        }
        return x;
    }

    public void printAOrder(Node x) {
        if (x == null) {
            return;
        }
        printAOrder(x.left);
        System.out.print(x.key + " ");
        printAOrder(x.right);
    }

    public void printDOder(Node x) {
        if (x == null)
            return;
        printDOder(x.right);
        System.out.print(x.key + " ");
        printDOder(x.left);
    }

    public boolean contains(Integer key) {
        root = contains_Tree(root, key);
        if (root != null) {
            return true;
        } else
            return false;
    }

    public Node contains_Tree(Node x, Integer key) {
        if (x == null || x.key == key) {
            return x;
        }
        if (key < x.key) {
            return contains_Tree(x.left, key);
        }
        return contains_Tree(x.left, key);
    }

    public void deleteMax() {
        root = deleteMax(root);
    }

    private Node deleteMax(Node x) {
        if (x.right == null)
            return x.left;
        x.right = deleteMax(x.right);
        return x;
    }

    public void delete_pre() {

    }

    public int height(Node x) {
        if (x == null) {
            return 0;
        }
        int left = height(x.left);
        int right = height(x.right);

        if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }
    }
    // private int height(){
    // int x= height_tree(root);
    // return x;
    // }

    public Integer sum(Node x) {
        if (x == null) {
            return 0;
        }
        return (x.key + sum(x.left) + sum(x.right));
    }

    public Integer sum() {
        return sum(root);
    }
}
