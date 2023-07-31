import java.util.NoSuchElementException;
public class IntLinkedList{
    private Node head;
    private int numnode;
    public IntLinkedList(){
       head = null; 
       numnode=0;
    }
    public void addFirst(int data){
        head = new Node(data,head);
        numnode ++;
    }
    public boolean addLast(int data){
        Node tmp = head;
        if (head ==null){
            addFirst(data);
            numnode++;
            return true;
        }
        else{

            while(tmp.getNext()!=null){
                if (data == tmp.getData()){
                    return false;
                }
                tmp.getNext();
            }
            Node tmp2 = head;
            while(tmp.getNext()!=null){
                tmp2.getNext();
            }
            Node newNode =new Node(data,null);
            tmp2.setNext(newNode);
            numnode++;
            return true;
        }

    }
    public Node getHead(){
        return head;
    }
    public boolean removeAt(int position){
        Node tmp = head;
        if(position ==1 && this.head !=null){
            this.head = this.head.getNext();
            return true;
        }
        int c =0;
        tmp = head.getNext();
        Node preNode = head;
        while(tmp != null){
            c++;
            if(c == position){
                preNode.setNext(tmp.getNext());
                return true;
            }
            preNode = tmp;
            tmp =tmp.getNext();
        }
        return false;

    }
    public int countOdd(){
        Node tmp = head;
        int countOdd =0;
        while (tmp != null){
            int a = tmp.getData();
            if(a % 2==0){
                countOdd++;
            }
            tmp= tmp.getNext();
        }
        return countOdd;
    }
    public int searchKey(int key){
        Node tmp = head;
        int count = 0;
        while(tmp != null){
            int a = tmp.getData();
            count++;
            if (a == key){
                return count;
            }
            tmp.getNext();
            
        }
        return -1;
    }
    public boolean checkSorted(){
        Node tmp = head;
        boolean check1 = true;
        boolean check2=true;
        while(tmp!=null){
            if(tmp.getData() > tmp.getNext().getData()){
                check1=false;
            }
            if(tmp.getData() < tmp.getNext().getData()){
                check2=false;
            }
            System.out.println(tmp.getData());
            tmp= tmp.getNext();
        }
        if(check1 || check2){
            return true;
        }
        return false;
    }
}