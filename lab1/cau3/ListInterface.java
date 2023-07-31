import java.util.NoSuchElementException;

public interface ListInterface<Integer> {
    public void addFirst(Integer item);
    public void addAfter(Node<Integer> curr, Integer item);
    public void addLast(Integer item);
    public Integer removeFirst() throws NoSuchElementException;
    public Integer removeAfter(Node<Integer> curr) throws NoSuchElementException;
    public Integer removeLast() throws NoSuchElementException;
    public int size();
    public boolean contains(Integer item);
    public void print();
    public boolean isEmpty();
    public Node<Integer> getHead();
    public Integer getFirst() throws NoSuchElementException;
    public Integer removeCurr(Node<Integer> curr) throws NoSuchElementException;
    public int countEvenItem();
    public int countPrimeItem();
    public void addItemBeforeFirstEvenItem(Integer item);
    public int findMaximumNumber();
    public void reverseList();
    public void sortAsc();
}
