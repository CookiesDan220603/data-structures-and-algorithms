public class Test {
    public static void main(String[] args){
        MyLinkedList<Fraction> list = new MyLinkedList<>();
        list.addFirst(new Fraction(2,3));
        list.addLast(new Fraction(1,4));
        list.addLast(new Fraction(3,4));
        list.print();
        System.out.println(list.size());
        System.out.println("Result of 2/3(FIRST) and (2/3)");
        System.out.print(list.getFirst().equals(new Fraction(2,3)) +"\n");
        System.out.println("Result of 2/3(FIRST) and (1/5)");
        System.out.println(list.getFirst().equals(new Fraction(1,5)));
    }
}
