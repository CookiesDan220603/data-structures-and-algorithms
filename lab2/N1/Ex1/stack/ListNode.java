class ListNode {
	private Fraction element;
	private ListNode next;
	public ListNode(Fraction item) { this(item, null); }
	public ListNode(Fraction item, ListNode  n) {
		element = item;
		next = n;
	}
	public ListNode  getNext() { 
		return next; 
	}
	public Fraction getElement() { 
		return element; 
	}
	public void setNext(ListNode n) {
		next = n ;
	}
}