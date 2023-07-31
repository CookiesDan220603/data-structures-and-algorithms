import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ListInterface<E>{
    private Node<E> head;
    public int numNode;
    public MyLinkedList(){
        this.head = null;
        this.numNode = 0;
    }

    @Override
    public void addFirst(E item){
        head = new Node<E> (item, head);
        numNode++;
    }

    @Override
    public void addAfter(Node<E> curr, E item){
        if(curr != null){
            curr.setNext(new Node<E>(item, curr.getNext()));
            numNode++;
        }else{
            addFirst(item);
        }
    }

    @Override
    public void addLast(E item){
        if(head == null){
            addFirst(item);
        }else{
            Node<E> tmp = head;
            while(tmp.getNext()!=null){
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node<E>(item));
            numNode++;
        }
    }

    @Override
    public E removeFirst() throws NoSuchElementException{
        if(head==null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }else{
            Node<E> tmp = head;
            head = head.getNext();
            numNode--;
            return tmp.getData();
        }
    }

    @Override
    public E removeAfter(Node<E> curr) throws NoSuchElementException{
        if(curr == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }else{
            Node<E> delNode = curr.getNext();
            if(delNode != null){
                curr.setNext(delNode.getNext());
                numNode--;
                return delNode.getData();
            }else{
                throw new NoSuchElementException("No next node to remove");
            }
        }
    }

    @Override
    public E removeLast() throws NoSuchElementException{
        if(head == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }else{
            Node<E> preNode = null;
            Node<E> delNode = head;
            while(delNode.getNext()!= null){
                preNode = delNode;
                delNode = delNode.getNext();
            }
            if(delNode == head)
                head = null;
            else
                preNode.setNext(delNode.getNext());
            numNode--;
            return delNode.getData();
        }
    }

    @Override
    public int size(){
        return this.numNode;
    }

    @Override
    public boolean contains(E item){
        Node<E> tmp = head;
        while(tmp!= null){
            if(tmp.getData().equals(item))
                return true;
            tmp = tmp.getNext();
        }
        return false;
    }

    @Override
    public void print(){
        if(head == null){
            System.out.println("List is empty");
        }else{
            Node<E> tmp = head;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while(tmp != null){
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }

    @Override
    public boolean isEmpty(){
        if(numNode == 0) return true;
        return false;
    }

    @Override
    public Node<E> getHead(){
        return this.head;
    }

    @Override
    public E getFirst() throws NoSuchElementException{
        if(head == null){
            throw new NoSuchElementException("Can't get element from an empty list");
        }else{
            return this.head.getData();
        }
    }

    @Override
    public E removeCurr(Node<E> curr) throws NoSuchElementException{
        Node<E> tmp = head;
        Node<E> preNode = null;
        while(!tmp.equals(curr)){
            preNode = tmp;
            tmp = tmp.getNext();
            if(tmp == null)
                throw new NoSuchElementException("curr don't exist in list.");
        }
        if(preNode == null){
            head = null;
        }else{
            preNode.setNext(tmp.getNext());
        }
        numNode--;
        return tmp.getData();
    }
}
