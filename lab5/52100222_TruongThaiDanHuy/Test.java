public class Test {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();
        list.addFirst(5);
        list.addLast(4);
        list.addLast(6);
        System.out.println(list.countOdd());
        // System.out.println(list.searchKey(2));
        System.out.println(list.checkSorted());
    }
}
