import java.util.NoSuchElementException;
public interface ListInterface<Integer> {
    public void addFirst(Integer item);
    public void addAfter(Node<Integer> curr,Integer item);
    public void addLast(Integer item);

    public Integer removeFirst() throws NoSuchElementException;
    public Integer removeAfter(Node<Integer> curr) throws NoSuchElementException;
    public Integer removeLast() throws NoSuchElementException;

    public void print();
    public boolean isEmpty();
    public Integer getFirst() throws NoSuchElementException;
    public Node<Integer> getHead();
    public int size();
    public boolean contains(Integer item);
    
}
