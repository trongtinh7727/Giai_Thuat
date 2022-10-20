public class Main {

  public static void main(String[] args) {
    DoubleLinkedList mylist = new DoubleLinkedList();
    mylist.addLast(1);
    mylist.addLast(1.5);
    mylist.addLast(2.30);
    mylist.addLast(4.7);
    mylist.addLast(4.7);
    mylist.print();
    System.out.println(mylist.CountPositive());
  }
}
