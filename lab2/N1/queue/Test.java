public class Test {
    public static void main(String[] args) {
        MyQueue<Integer> q1 = new MyQueue<Integer>();
        q1.enQueue(1);
        q1.enQueue(5);
        q1.enQueue(9);
        q1.print();
        q1.deQueue();
        q1.print();
        System.out.println();
        System.out.println(q1.size()); q1.size();
        q1.enQueue(5);
        System.out.println(q1.getFront());
    }
}
