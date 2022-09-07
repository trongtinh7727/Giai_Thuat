public class Main {

  public static void main(String[] args) {
    Fraction f1 = new Fraction(5, 3);
    int f2 = 5;
    System.out.println(f1.equals(f2));
    System.out.println(f1.toString());
    MyLinkedList<Fraction> list = new MyLinkedList<Fraction>();
    list.addFirst(new Fraction(1, 8));
    list.addFirst(new Fraction(2, 8));
    list.addFirst(new Fraction(3, 8));
    list.addFirst(new Fraction(4, 8));
    list.print();
    Node<Fraction> temp = list.getHead().getNext();
    System.out.println(temp.toString());
    list.removeCurr(temp);

    MyLinkedList<Integer> listIn = new MyLinkedList<Integer>();
    listIn.addFirst(1);
    listIn.addFirst(2);
    listIn.addFirst(7);
    listIn.addFirst(4);

    // listIn.print();
    // listIn.reverse();
    // listIn.print();

    listIn.sort();
    listIn.print();
  }
}
