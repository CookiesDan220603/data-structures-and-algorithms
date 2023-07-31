import java.util.*;
public interface QueueInterface {
public boolean isEmpty();
public int size();
public Fraction getFirst() throws NoSuchElementException;
public boolean contains(Fraction item);
public void addFirst(Fraction item);
public Fraction removeFirst() throws NoSuchElementException;
public void addLast(Fraction item);
}