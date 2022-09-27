import java.util.EmptyStackException;

public class MyStack<E> implements StackInterface<E> {

  private Node<E> top;
  private int numNode;

  public MyStack() {
    this.top = null;
    numNode = 0;
  }

  @Override
  public void push(E item) {
    if (isEmpty()) {
      top = new Node<E>(item, null);
      numNode++;
    } else {
      Node<E> tmp = this.top;
      this.top = new Node<E>(item, tmp);
      numNode++;
    }
  }

  @Override
  public E pop() throws EmptyStackException {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    Node<E> tmp = this.top;
    this.top = tmp.getNext();
    tmp.setNext(null);
    numNode--;
    return tmp.getElement();
  }

  @Override
  public int size() {
    return this.numNode;
  }

  @Override
  public boolean containts(E item) {
    Node<E> tmp = this.top;
    while (tmp != null) {
      if (tmp.getElement() == item) return true;
      tmp = tmp.getNext();
    }
    return false;
  }

  @Override
  public void print() {
    Node<E> tmp = this.top;
    System.out.println("Stack:\n -> " + this.top.getElement());
    tmp = tmp.getNext();
    while (tmp != null) {
      System.out.println(" -> " + tmp.getElement());
      tmp = tmp.getNext();
    }
  }

  @Override
  public boolean isEmpty() {
    if (this.top == null) return true;
    return false;
  }

  @Override
  public E getPeek() {
    return this.top.getElement();
  }

  @Override
  public double rescusive() {
    if ((int) top.getElement() == 1) {
      return 3;
    }
    double n = Double.valueOf((int) top.getElement());
    return Math.pow(2, n) + (int) this.pop() * (int) this.pop() + rescusive();
  }

  public Node<E> setTail() {
    Node<E> tmp = top;
    while (tmp.getNext() != null) {
      tmp = tmp.getNext();
    }

    return tmp;
  }
}
