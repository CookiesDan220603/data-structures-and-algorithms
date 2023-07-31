public class Test {
    public static void main(String[] args) {
        AVL tree = new AVL();
        tree.root = tree.insert(tree.root,41);
        tree.root = tree.insert(tree.root,20);
        tree.root = tree.insert(tree.root,11);
        tree.root = tree.insert(tree.root,29);
        tree.root = tree.insert(tree.root,32);
        tree.root = tree.insert(tree.root,65);
        tree.root = tree.insert(tree.root,50);
        tree.root = tree.insert(tree.root,91);
        tree.root = tree.insert(tree.root,72);
        tree.root = tree.insert(tree.root,99);

        System.out.println("Preorder traversal" +
                        " of constructed tree is : ");
        tree.preOrder(tree.root);
    }  
}
