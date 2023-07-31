public class Node <E> {
    private E data;
    private Node<E> next;
    public Node(){
        data = null;
        next = null;
    }
    public Node(E data){
        this.data = data;
    }
    public Node(E data, Node<E> next){
        this.data = data;
        this.next = next;
    }
    public Node<E> getNext(){
        return next;
    }
    public E getData(){
        return data;
    }
    public void setNext(Node<E> n){
        next = n;
    }
}
