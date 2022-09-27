import java.util.*;

public class QueueByStack<E> implements QueueInterface<E> {

  private int numNode;
  private MyStack<E> stack1;
  private MyStack<E> stack2;

  public QueueByStack() {
    this.stack1 = new MyStack<E>();
    this.stack2 = new MyStack<E>();
    this.numNode = 0;
  }

  @Override
  public void enQueue(E item) {
    if (stack1.isEmpty()) {
      this.stack1.push(item);
    } else {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.getPeek());
        this.stack1.pop();
      }
      stack1.push(item);
      while (!stack2.isEmpty()) {
        stack1.push(stack2.getPeek());
        this.stack2.pop();
      }
    }
    numNode++;
  }

  @Override
  public E deQueue() {
    if (this.stack1.isEmpty()) {
      throw new EmptyStackException();
    }
    numNode--;
    return stack1.pop();
  }

  @Override
  public int size() {
    return this.numNode;
  }

  @Override
  public void print() {
    this.stack1.print();
  }

  @Override
  public boolean isEmpty() {
    return this.stack1.isEmpty();
  }

  @Override
  public E getFront() {
    return this.stack1.getPeek();
  }

  @Override
  public boolean constains(E item) {
    return this.stack1.containts(item);
  }
}
