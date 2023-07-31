public class Node<E>{
    private E element;
    private Node<E> next;

    public Node(){
        this.element = null;
        this.next = null;
    }

    public Node(E data){
        this.element = data;
        this.next = null;
    }

    public Node(E data, Node<E> next){
        this.element = data;
        this.next = next;
    }

    public E getData(){
        return this.element;
    }

    public Node<E> getNext(){
        return this.next;
    }

    public void setNext(Node<E> curr){
        this.next = curr;
    }
}