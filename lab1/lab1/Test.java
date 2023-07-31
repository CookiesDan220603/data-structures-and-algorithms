public class Test {
    public static void main(String[] args) {
        IntergerNumber<Integer> list = new IntergerNumber<Integer>();
        list.addFirst(10);
        list.addLast(3);
        list.addFirst(1);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(3);
        list.addLast(8);
        list.print();
    }
}
