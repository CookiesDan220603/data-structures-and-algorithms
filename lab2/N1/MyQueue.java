import java.util.NoSuchElementException;

public class MyQueue<E> implements QueueInterface<E>{
    private Node<E> front;
    private Node<E> rear;
    private int numNode;

    public MyQueue(){
        this.front = null;
        this.rear = null;
        this.numNode = 0;
    }

    @Override
    public void enQueue(E item){
        if(this.front == null){
            this.front = new Node<E>(item);
            this.rear = this.front;
        }
        else{
            this.rear.setNext(new Node<E>(item));
            this.rear = this.rear.getNext();
        }
        this.numNode++;
    }

    @Override
    public E deQueue() throws NoSuchElementException{
        if(this.front == null){
            throw new NoSuchElementException("Can't remove element from an empty queue");
        }else{
            Node<E> tmp = this.front;
            if(this.front == this.rear)
                this.rear = null;
            this.front = this.front.getNext();
            this.numNode--;
            return tmp.getData();
        }
    }

    @Override
    public int size(){
        return this.numNode;
    }
    @Override
    public boolean contains(E item){
        Node<E> tmp = this.front;
        while(tmp!= null){
            if(tmp.getData().equals(item))
                return true;
            tmp = tmp.getNext();
        }
        return false;
    }

    @Override
    public void print() throws NoSuchElementException{
        if(this.numNode == 0){
            throw new NoSuchElementException("Queue is empty!");
        }else{
            Node<E> tmp = this.front;
            while(tmp!= null){
                System.out.print(tmp.getData() + " ");
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }

    @Override
    public boolean isEmpty(){
        if(this.numNode == 0)
            return true;
        else 
            return false;
    }

    @Override
    public E getFront(){
        if(this.front == null){
            throw new NoSuchElementException("Can't get element from a empty queue.");
        }else{
            return this.front.getData();
        }
    }
}
