public class Node<Integer>{
    private Integer element;
    private Node<Integer> next;

    public Node(){
        this.element = null;
        this.next = null;
    }

    public Node(Integer data){
        this.element = data;
        this.next = null;
    }

    public Node(Integer data, Node<Integer> next){
        this.element = data;
        this.next = next;
    }

    public Integer getData(){
        return this.element;
    }

    public Node<Integer> getNext(){
        return this.next;
    }

    public void setNext(Node<Integer> curr){
        this.next = curr;
    }
}