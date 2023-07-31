public class Test {
    public static void main(String[] args) {
        MyStack<Integer> st1 = new MyStack<Integer>();
        st1.push(5);
        st1.pop();
        st1.push(2);
        st1.push(1);
        st1.push(3);
        st1.print();
    }
}
