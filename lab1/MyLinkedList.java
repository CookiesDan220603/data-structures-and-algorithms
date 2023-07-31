import java.util.NoSuchElementException;
public class MyLinkedList {
    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static void printLinkedList(Node head){
        if(head!=null){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.value);
                temp=temp.next;
                if(temp.next!=null){
                    System.out.print("->");
                }
                else{
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        printLinkedList(n1);
    }
}
