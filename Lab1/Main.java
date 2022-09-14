public class Main {

  public static void main(String[] args) {
    System.out.println("----Fraction------");
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
    System.out.println("------Remove curr-------");
    System.out.println("Remove:");
    System.out.println(temp.getData());
    list.removeCurr(temp);
    System.out.println("List after remove");
    list.print();
    System.out.println("----------Integer list--------");
    MyLinkedList<Integer> listIn = new MyLinkedList<Integer>();
    listIn.addFirst(1);
    listIn.addFirst(2);
    listIn.addFirst(7);
    listIn.addFirst(4);

    listIn.print();
    System.out.printf("The number of even: %d\n", listIn.CountEven());
    System.out.printf("The number of prime: %d\n", listIn.CountPrime());
    System.out.println("Add 5 before first even number:");
    listIn.addBefore(5);
    listIn.print();
    System.out.printf("Max value: %d\n", listIn.maxValue());
    System.out.println("Reverse list:");
    listIn.reverse();
    listIn.print();
    System.out.println("Sort");
    listIn.sort();
    listIn.print();
  }
}
