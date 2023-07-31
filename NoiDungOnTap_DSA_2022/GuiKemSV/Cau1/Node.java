public class Node{
	private char data;
	private Node next;	
	
	public Node(char data, Node next){
		this.data = data;
		this.next = next;
	}
	
	public Node(){
		this.data = 0;
		this.next = null;
	}
	
	public char getData(){
		return this.data;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}	
}