public class MyQueue<E> implements QueueInterface<E> {

  private Node<E> front;
  private Node<E> rear;
  private int numNode;

  public MyQueue() {
    this.front = null;
    this.rear = null;
    this.numNode = 0;
  }

  @Override
  public void enQueue(E item) {
    if (isEmpty()) {
      this.rear = new Node<E>(item, null);
      this.front = this.rear;
      numNode++;
    } else {
      Node<E> newNode = new Node<E>(item, null);
      this.rear.setNext(newNode);
      this.rear = newNode;
      numNode++;
    }
    // TODO Auto-generated method stub

  }

  @Override
  public E deQueue() {
    if (isEmpty()) {
      return null;
    }
    if (numNode == 1) {
      Node<E> tmp = this.front;
      this.rear = this.front = null;
      numNode--;
      return tmp.getElement();
    } else {
      Node<E> tmp = this.front;
      this.front = tmp.getNext();
      tmp.setNext(null);
      numNode--;
    }
    return null;
  }

  @Override
  public int size() {
    return this.numNode;
  }

  @Override
  public boolean constains(E item) {
    if (!isEmpty()) {
      Node<E> tmp = this.front;
      while (tmp != null) {
        if (tmp.getElement() == item) return true;
        tmp = tmp.getNext();
      }
    }
    return false;
  }

  @Override
  public void print() {
    Node<E> tmp = this.front;
    System.out.print("Queue:" + this.front.getElement());
    tmp = tmp.getNext();
    while (tmp != null) {
      System.out.print(" - " + tmp.getElement());
      tmp = tmp.getNext();
    }
  }

  @Override
  public boolean isEmpty() {
    if (this.front == null) return true;
    return false;
  }

  @Override
  public E getFront() {
    return this.front.getElement();
  }
}
