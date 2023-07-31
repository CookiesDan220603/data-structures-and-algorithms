public class Test {
    public static void main(String[] args){
        MyLinkedList<Integer> mylist = new MyLinkedList<Integer>();
        mylist.addFirst(5);
        mylist.addFirst(6);
        mylist.addFirst(7);
        mylist.addFirst(8);
        mylist.addFirst(9);
        mylist.print();
        Node<Integer> node1 = new Node<Integer>(1);
        // mylist.addFirst(node1);
        mylist.addAfter(null, 7);
        Node<Integer> node2 = mylist.getHead().getNext();
        mylist.print();
        mylist.removeCurr(node2);
        mylist.print();
        System.out.println(mylist.size());
    }
}
