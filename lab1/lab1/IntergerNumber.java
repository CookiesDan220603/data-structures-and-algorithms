import java.util.NoSuchElementException;
import java.util.*;
public class IntergerNumber<Integer> implements ListInterface<Integer>{
    private Node<Integer> head;
    private int numNode;
    public IntergerNumber(){
        head = null;
        numNode =0;
    }
    @Override
    public void addFirst ( Integer item ){
    
        head = new Node < Integer > ( item , head ) ;
        numNode ++ ;
    }
    @Override
    public void addAfter(Node<Integer> curr, Integer item){
        if(curr == null){
            addFirst(item);
        }
        else{
            Node<Integer> newNode = new Node<Integer>(item, curr.getNext());
            curr.setNext(newNode);
        }
    }
    @Override
    public void addLast ( Integer item ) {
        if ( head == null ) {
            addFirst ( item ) ;
    }
        else {
            Node < Integer > tmp = head ;
            while ( tmp.getNext () != null ) {
                tmp =tmp.getNext() ;
            }
            Node < Integer > newNode = new Node < Integer > ( item , null ) ;
            tmp.setNext ( newNode ) ;
            numNode ++ ;
        } 
    }
    @Override
    public Integer removeFirst() throws NoSuchElementException{
        if (head == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }
        else{
            Node<Integer> tmp = head;
            head = head.getNext();
            numNode --;
            return tmp.getData();

        }
    }
    @Override
    public Integer removeAfter(Node<Integer> curr)throws NoSuchElementException{
        if (curr == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }
        else{
            Node<Integer> delNode = curr.getNext();
            if (delNode !=null){
                curr.setNext(delNode.getNext());
                numNode--;
                return delNode.getData();
            }
            else{
            throw new NoSuchElementException("No next node to remove");
            }
        }
    }
    @Override
    public Integer removeLast() throws NoSuchElementException{
        if (head == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }
        else {
            Node<Integer> preNode = null;
            Node<Integer> delNode = head;
            while(delNode.getNext()!=null){
                preNode = delNode;
                delNode = delNode.getNext();
            }
            preNode.setNext(delNode.getNext());
            delNode.setNext(null);
            numNode--;
            return delNode.getData();
        }
    }
    @Override
    public void print(){
        if(head != null){
            Node<Integer> tmp = head;
            System.out.print("List : " + tmp.getData());
            tmp = tmp.getNext();
            while(tmp!=null){
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        }
        else{
            System.out.println("list is empty!");
        }
    }
    @Override
    public boolean isEmpty(){
        if(numNode == 0) return true;
        return false;
    }
    @Override
    public Integer getFirst() throws NoSuchElementException{
        if(head == null){
            throw new NoSuchElementException("Can't get element from an empty list");
        }
        else{
            return head.getData();
        }
    }
    @Override
    public Node<Integer> getHead(){
        return head;
    }
    @Override
    public int size(){
        return numNode;
    }
    @Override
    public boolean contains(Integer item){
        Node<Integer> tmp = head;
        while(tmp != null){
            if(tmp.getData().equals(item))
                return true;
            tmp = tmp.getNext();
        }
        return false;
    }
    public void countEvent() throws NoSuchElementException{
        if(head != null){
            Node<Integer> tmp = head;
            
            while(tmp!=null){
                String tmp2 = String.format("%d",tmp.getData());
                
                tmp = tmp.getNext();
            }
            System.out.println();
        }
        else{
            System.out.println("list is empty!");
        }
    }

}