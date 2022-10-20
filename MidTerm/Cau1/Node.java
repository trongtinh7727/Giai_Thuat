public class Node {

  private double data;
  private Node next;

  public Node() {
    data = 0;
    next = null;
  }

  public Node(double data) {
    this(data, null);
  }

  public Node(double data, Node next) {
    this.data = data;
    this.next = next;
  }

  public Node getNext() {
    return next;
  }

  public double getData() {
    return data;
  }

  public void setNext(Node n) {
    this.next = n;
  }
}
