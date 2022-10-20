import java.util.NoSuchElementException;

public class DoubleLinkedList implements ListInterface {

  private Node head;

  public DoubleLinkedList() {
    this.head = null;
  }

  @Override
  public void addLast(double data) {
    if (this.head == null) {
      head = new Node(data);
    } else {
      Node tmp = head;
      while (tmp.getNext() != null) {
        tmp = tmp.getNext();
      }
      tmp.setNext(new Node(data));
    }
  }

  @Override
  public double getFirst() throws NoSuchElementException {
    if (this.head == null) {
      throw new NoSuchElementException();
    }
    return head.getData();
  }

  @Override
  public int CountPositive() {
    if (this.head == null) {
      return 0;
    }
    Node tmp = head;
    int counter = 0;
    while (tmp.getNext() != null) {
      if (tmp.getData() > 0) {
        counter++;
      }
      tmp = tmp.getNext();
    }
    if (tmp.getData() > 0) {
      counter++;
    }
    return counter;
  }

  @Override
  public void print() {
    if (this.head != null) {
      Node tmp = head;
      while (tmp.getNext() != null) {
        System.out.printf("%f->", tmp.getData());
        tmp = tmp.getNext();
      }
      System.out.printf("%f->", tmp.getData());
    }
  }

  @Override
  public Node getHead() {
    return head;
  }
}
