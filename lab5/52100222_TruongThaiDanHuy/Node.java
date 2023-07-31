public class Node{
    private int data;
    private Node next;
    public Node(){
        data =0;
        next = null;
    }
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    public int getData(){
        return this.data;
    }
    public void setNext(Node n){
        next = n;
    }
    public Node getNext(){
        return this.next;
    }
}