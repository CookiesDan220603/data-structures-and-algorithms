public class Node<E>{
    private E data;
    private Node<E> next;

    public Node(){
        this.data = null;
        this.next = 0;
    }
    public Node(E data){
        this(data, null);
    }
    public Node(E data, Node<E> next){
        this.data = data;
        this.next = next;
    }
    public getData(){
        return data;
    }
    public Node<E> getNext(){
        return next;
    }
    public void setNext(Node<E> n){
        next = n;
    }
}
