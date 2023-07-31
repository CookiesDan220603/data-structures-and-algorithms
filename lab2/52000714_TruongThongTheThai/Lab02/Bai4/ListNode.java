class ListNode {
    private String element;
    private ListNode next;

    public ListNode(String item) {
        this(item, null);
    }

    public ListNode(String item, ListNode n) {
        element = item;
        next = n;
    }
    public ListNode getNext() {
        return next;
    }

    public String getElement() {
        return element;
    }

    public void setNext(ListNode n) {
        next = n;
    }
}