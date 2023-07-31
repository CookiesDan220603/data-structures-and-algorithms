import java.util.NoSuchElementException;
import java.lang.Math;

public class MyLinkedList<Integer> implements ListInterface<Integer>{
    private Node<Integer> head;
    public int numNode;
    public MyLinkedList(){
        this.head = null;
        this.numNode = 0;
    }

    @Override
    public void addFirst(Integer item){
        head = new Node<Integer> (item, head);
        numNode++;
    }

    @Override
    public void addAfter(Node<Integer> curr, Integer item){
        if(curr != null){
            curr.setNext(new Node<Integer>(item, curr.getNext()));
            numNode++;
        }else{
            addFirst(item);
        }
    }

    @Override
    public void addLast(Integer item){
        if(head == null){
            addFirst(item);
        }else{
            Node<Integer> tmp = head;
            while(tmp.getNext()!=null){
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node<Integer>(item));
            numNode++;
        }
    }

    @Override
    public Integer removeFirst() throws NoSuchElementException{
        if(head==null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }else{
            Node<Integer> tmp = head;
            head = head.getNext();
            numNode--;
            return tmp.getData();
        }
    }

    @Override
    public Integer removeAfter(Node<Integer> curr) throws NoSuchElementException{
        if(curr == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }else{
            Node<Integer> delNode = curr.getNext();
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
    public Integer removeLast() throws NoSuchElementException{
        if(head == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }else{
            Node<Integer> preNode = null;
            Node<Integer> delNode = head;
            while(delNode.getNext()!= null){
                preNode = delNode;
                delNode = delNode.getNext();
            }
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
    public boolean contains(Integer item){
        Node<Integer> tmp = head;
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
            Node<Integer> tmp = head;
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
    public Node<Integer> getHead(){
        return this.head;
    }

    @Override
    public Integer getFirst() throws NoSuchElementException{
        if(head == null){
            throw new NoSuchElementException("Can't get element from an empty list");
        }else{
            return this.head.getData();
        }
    }

    @Override
    public Integer removeCurr(Node<Integer> curr) throws NoSuchElementException{
        // System.out.println(curr.getData());
        Node<Integer> tmp = head;
        Node<Integer> preNode = null;
        while(!tmp.equals(curr)){
            preNode = tmp;
            tmp = tmp.getNext();
            if(tmp == null)
                throw new NoSuchElementException("curr don't exist in list.");
        }
        if(tmp == head){
            head = tmp.getNext();
        }else{
            preNode.setNext(tmp.getNext());
        }
        numNode--;
        return tmp.getData();
    }

    @Override
    public int countEvenItem(){
        Node<Integer> tmp = head;
        int c = 0;
        while(tmp != null){
            if((int)tmp.getData()%2 ==0) c++;
            tmp = tmp.getNext();
        }
        return c;
    }

    @Override
    public int countPrimeItem(){
        Node<Integer> tmp = head;
        int c = 0;
        while(tmp != null){
            int m = (int)tmp.getData();
            boolean dk = true;
            for(int i = 2; i<= Math.sqrt(m); i++){
                if(m%i ==0){
                    dk=false;
                    break;
                }
            }
            if(dk) c++;
            tmp = tmp.getNext();
        }
        return c;
    }

    @Override
    public void addItemBeforeFirstEvenItem(Integer x){
        Node<Integer> tmp = head;
        Node<Integer> preNode = null;
        while(tmp != null){
            if((int)tmp.getData()%2 ==0){
                addAfter(preNode, x);
                break;
            }
        }
    }

    @Override
    public int findMaximumNumber(){
        Node<Integer> tmp = head;
        int max = (int)tmp.getData();
        tmp = tmp.getNext();
        while(tmp != null){
            if((int)tmp.getData() > max) max=(int)tmp.getData();
            tmp = tmp.getNext();
        }
        return max;
    }

    @Override
    public void reverseList(){
        Node<Integer> tmp = head.getNext();
        for(int i = 0; i< numNode - 1; i++){
            Node<Integer> tmp2 = tmp;
            tmp = tmp.getNext();
            addFirst(tmp2.getData());
            removeCurr(tmp2);
        }
    }

    @Override
    public void sortAsc(){
        for(int i = 0; i < numNode; i++){
            Node<Integer> tmp = head;
            for(int j = 0; j < i; j++){
                tmp = tmp.getNext();
            }
            Node<Integer> tmp2 = tmp;
            for(int j = i + 1; j < numNode; j++){
                tmp2 = tmp2.getNext();
                if((int)tmp.getData() > (int)tmp2.getData()){
                    addAfter(tmp, tmp2.getData());
                    addAfter(tmp2, tmp.getData());
                    removeCurr(tmp);
                    removeCurr(tmp2);
                    tmp = head;
                    for(int t = 0; t< i; t++)
                    {
                        tmp = tmp.getNext();
                    }
                    tmp2 = head;
                    for(int t = 1; t<=j; t++)
                        tmp2 = tmp2.getNext();
                }
            }
        }
    }
}
