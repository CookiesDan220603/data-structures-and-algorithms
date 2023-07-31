public class Test {
    public static BST createTree(String strKey) {
        String[] spl = strKey.split(" ");
        BST tree = new BST();
        for (int i = 0; i < spl.length; i++) {
            Integer key = Integer.parseInt(spl[i]);
            // System.out.println(key);
            tree.root=tree.insert(tree.root, key);
        }
        return tree;
    }

    public static void main(String[] args) {
        BST myBST = new BST();
        myBST.root = myBST.insert(myBST.root, 45);
        myBST.root = myBST.insert(myBST.root, 10);
        myBST.root = myBST.insert(myBST.root, 7);
        myBST.root = myBST.insert(myBST.root, 12);
        myBST.root = myBST.insert(myBST.root, 90);
        myBST.root = myBST.insert(myBST.root, 50);
        // myBST.NLR(myBST.root);
        // System.out.println();
        // myBST.LNR(myBST.root);
        // System.out.println();
        // myBST.LRN(myBST.root);
        // System.out.println();
        // System.out.println(myBST.search(myBST.root, 10).getKey());
        // System.out.println(myBST.min(myBST.root).getKey());
        // System.out.println(myBST.max(myBST.root).getKey());

        // myBST.deleteMin(myBST.root);
        // myBST.NLR(myBST.root);

        myBST.delete(myBST.root, 7);
        myBST.NLR(myBST.root);

        // myBST.delete(myBST.root, 90);
        // myBST.NLR(myBST.root);

        // System.out.println();
        // myBST.delete(myBST.root, 45);
        // myBST.NLR(myBST.root);

        //2
        // String s = "12 7 2003";
        // BST tree = createTree(s);
        // tree.LRN(tree.root);
        


        //3
        // myBST.printAOrder(myBST.root);
        // System.out.println();

        //4
        // myBST.printDOder(myBST.root);
        //System.out.println();

        //5
        // System.out.println(myBST.contains(2));
        // System.out.println(myBST.contains(7));

        //6
        // myBST.deleteMax();
        // myBST.printDOder(myBST.root);
        
        //7


        //8
        System.out.println(myBST.height(myBST.root));

        //9
        //System.out.println(myBST.sum(myBST.root));

        //10
        // System.out.println(myBST.sum(myBST.root));

    }
}
