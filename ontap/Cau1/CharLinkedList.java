public class CharLinkedList {
    Node head;
    public CharLinkedList(){
        head = null;
    }
    public Node getHead(){
        return head;
    }
    public void addFirst(char data){
        head = new Node(data,head);
    }
    public boolean addAfterFirstKey(char data, char key){
        Node tmp = head;
        while(tmp != null){
            if(tmp.getData() == key){
                Node t = new Node(data,tmp.getNext());
                tmp.setNext(t);
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }
    public int largestCharPostition(){
        if (head == null){
            return -1;
        }
        Node tmp = head;
        int index = 0, maxIndex = 0;
        int maxData = (int) tmp.getData();
        while(tmp != null){
            if((int)tmp.getData()>maxData){
                maxData = (int)tmp.getData();
                maxIndex = index;
            }
            index++;
            tmp = tmp.getNext();
        }
        return maxIndex;

    }
    public void printdata(){
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.getData()+"->");
            tmp= tmp.getNext();
        }
    }
}
