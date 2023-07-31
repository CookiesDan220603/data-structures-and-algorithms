public class Test {
    public static void main(String[] args){
        CharLinkedList list = new CharLinkedList();
        list.addFirst('b');
        list.addFirst('a');
        list.addAfterFirstKey('c', 'a');
        System.out.println(list.largestCharPostition());
    }
}
