import java.util.*;

public class MyStack<E> implements StackInterface<E> {

  private Node<E> top;
  private int numNode;

  public MyStack() {
    this.top = null;
    this.numNode = 0;
  }

  @Override
  public void push(E item) {
    this.top = new Node<E>(item, top);
    numNode++;
  }

  @Override
  public E pop() {
    if (isEmpty() == true) {
      return null;
    } else {
      Node<E> tmp = top;
      top = top.getNext();
      numNode--;
      return tmp.getData();
    }
  }

  @Override
  public int size() {
    return numNode;
  }

  @Override
  public boolean contains(E item) {
    Node<E> tmp = top;
    while (tmp.getNext() != null) {
      if (tmp.getData().equals(item)) {
        return true;
      }
      tmp = tmp.getNext();
    }
    return false;
  }

  @Override
  public void print() {
    if (top != null) {
      Node<E> tmp = top;
      System.out.print("Stack is: " + tmp.getData());
      tmp = tmp.getNext();
      while (tmp != null) {
        System.out.print("-> " + tmp.getData());
        tmp = tmp.getNext();
      }
      System.out.println();
    } else {
      System.out.println("isEmpty...");
    }
  }

  @Override
  public boolean isEmpty() {
    if (this.numNode == 0) {
      return true;
    }
    return false;
  }

  @Override
  public E getPeek() {
    if (top == null) {
      return null;
    }
    return top.getData();
  }
}
