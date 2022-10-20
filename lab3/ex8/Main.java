public class Main {

  public static void main(String[] args) {
    MyLinkedList<Integer> mylist = new MyLinkedList<>();
    mylist.addSortedList(1);
    mylist.addSortedList(5);
    mylist.addSortedList(3);
    mylist.addSortedList(6);
    mylist.addSortedList(2);
    mylist.print();
    System.out.printf("Even numbers: %d\n", mylist.CountEven());
    System.out.printf("Sum: %d\n", mylist.Sum());
  }
}
