public class MyStack<E> implements StackInterface<E>{
    private Node<E> top;
    private int numNode;

    public MyStack(){
        this.top = null;
    }
    public void push(E item){
        top = new Node<E>(item, top);
        numNode++;
    }
}