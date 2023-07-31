public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.addAfter(new Node<Integer>(5),15);

        list.print();
        System.out.println(list.size());
    }
    
}
