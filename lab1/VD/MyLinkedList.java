import java.util.NoSuchElementException;
public class MyLinkedList <E> implements ListInterface<E>{
    private Node < E > head ;
    private int numNode ;
    public MyLinkedList ( ) {
        head = null ;
        numNode = 0 ;
   }
    @Override
    public void addFirst ( E item ){
    
        head = new Node < E > ( item , head ) ;
        numNode ++ ;
    }
    @Override
public void addAfter ( Node <E> curr , E item ) {
    if ( curr == null ) {
        addFirst(item);
    }

    else {
        Node < E > newNode = new Node < E > ( item , curr.getNext ( ) ) ;
        curr.setNext ( newNode ) ;
    }
    numNode ++ ;
}
@Override
public void addLast ( E item ) {
    if ( head == null ) {
        addFirst ( item ) ;
   }
    else {
        Node < E > tmp = head ;
        while ( tmp.getNext () != null ) {
            tmp =tmp.getNext() ;
        }
        Node < E > newNode = new Node < E > ( item , null ) ;
        tmp.setNext ( newNode ) ;
        numNode ++ ;
    } 
}
@Override
public E removeFirst() throws NoSuchElementException{
    if (head == null){
        throw new NoSuchElementException("Can't remove element from an empty list");
    }
    else{
        Node<E> tmp = head;
        head = head.getNext();
        numNode --;
        return tmp.getData();

    }
}
@Override
public E removeAfter(Node<E> curr)throws NoSuchElementException{
    if (curr == null){
        throw new NoSuchElementException("Can't remove element from an empty list");
    }
    else{
        Node<E> delNode = curr.getNext();
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
public E removeLast() throws NoSuchElementException{
    if (head == null){
        throw new NoSuchElementException("Can't remove element from an empty list");
    }
    else {
        Node<E> preNode = null;
        Node<E> delNode = head;
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
        Node<E> tmp = head;
        System.out.println("List : " + tmp.getData());
        tmp = tmp.getNext();
        while(tmp!=null){
            System.out.println(" -> " + tmp.getData());
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
public E getFirst() throws NoSuchElementException{
    if(head == null){
        throw new NoSuchElementException("Can't get element from an empty list");
    }
    else{
        return head.getData();
    }
}
@Override
public Node<E> getHead(){
    return head;
}
@Override
public int size(){
    return numNode;
}
@Override
public boolean contains(E item){
    Node<E> tmp = head;
    while(tmp != null){
        if(tmp.getData().equals(item))
            return true;
        tmp = tmp.getNext();
    }
    return false;
}
}  
    