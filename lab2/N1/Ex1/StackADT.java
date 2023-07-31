import java.util.*;
public interface StackADT {
public boolean isEmpty();
public Fraction peek() throws EmptyStackException;
public Fraction pop() throws EmptyStackException;
public void push(Fraction item);
}