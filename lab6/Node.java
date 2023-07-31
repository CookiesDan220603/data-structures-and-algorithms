public class Node{
    Integer key;
    Node left, right;
    
    public Node(Integer key){
        this.key=key;
        this.left=this.right=null;
    }
    public void setKey(int key){
        this.key=key;
    }
    public int getKey(){
        return this.key;
    }
}