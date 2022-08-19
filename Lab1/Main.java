public class Main {

  public static void main(String[] args) {
    Fraction f1 = new Fraction(5, 3);
    int f2 = 5;
    System.out.println(f1.equals(f2));
    System.out.println(f1.toString());
    MyLinkedList<Fraction> list = new MyLinkedList<Fraction>();
    list.addFirst((f1));
    list.addFirst(new Fraction(7, 8));
    list.addFirst(new Fraction(7, 8));
    list.addFirst(new Fraction(7, 8));
    // list.removeCurr(new Node<Fraction>(f1));
    list.print();
  }
}
