import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ListInterface<E> {

  private Node<E> head;
  private int numNode;

  public MyLinkedList() {
    head = null;
    numNode = 0;
  }

  @Override
  public void addFirst(E item) {
    head = new Node<E>(item, head);
    numNode++;
  }

  @Override
  public void addAfter(Node<E> curr, E item) {
    if (curr == null) {
      addFirst(item);
    } else {
      Node<E> newNode = new Node<E>(item, curr.getNext());
      curr.setNext(newNode);
      numNode++;
    }
  }

  @Override
  public void addLast(E item) {
    if (head == null) {
      addFirst(item);
    } else {
      Node<E> tmp = head;
      while (tmp.getNext() != null) {
        tmp = tmp.getNext();
      }
      Node<E> newNode = new Node<E>(item, null);
      tmp.setNext(newNode);
      numNode++;
    }
  }

  @Override
  public E removeFirst() throws NoSuchElementException {
    if (head == null) {
      throw new NoSuchElementException(
        "Can't remove element from an empty list"
      );
    } else {
      Node<E> tmp = head;
      head = head.getNext();
      numNode--;
      return tmp.getData();
    }
  }

  @Override
  public E removeAfter(Node<E> curr) throws NoSuchElementException {
    if (curr == null) {
      throw new NoSuchElementException(
        "Can't remove element from an empty list"
      );
    } else {
      Node<E> delNode = curr.getNext();
      if (delNode != null) {
        curr.setNext(delNode.getNext());
        numNode--;
        return delNode.getData();
      } else {
        throw new NoSuchElementException("No next node to remove");
      }
    }
  }

  @Override
  public E removeCurr(Node<E> curr) {
    Node<E> tmp = this.getHead();
    if (curr == null) {
      throw new NoSuchElementException(
        "Can't remove element from an empty list"
      );
    } else {
      if (tmp == curr) {
        return this.removeFirst();
      }
      while (tmp.getNext() != curr && tmp.getNext() != null) {
        tmp = tmp.getNext();
      }
      if (tmp.getNext() == null) {
        throw new NoSuchElementException(
          "Can't remove element from an empty list"
        );
      }
      tmp.setNext(curr.getNext());
      numNode--;
    }
    return tmp.getData();
  }

  @Override
  public E removeLast() throws NoSuchElementException {
    if (head == null) {
      throw new NoSuchElementException(
        "Can't remove element from an empty list"
      );
    } else {
      Node<E> preNode = null;
      Node<E> delNode = head;
      if (delNode.getNext() == null) {
        return removeFirst();
      }
      while (delNode.getNext() != null) {
        preNode = delNode;
        delNode = delNode.getNext();
      }
      preNode.setNext(delNode.getNext());
      numNode--;
      return delNode.getData();
    }
  }

  public E getLast() {
    Node<E> preNode = null;
    Node<E> tmp = head;
    while (tmp.getNext() != null) {
      preNode = tmp;
      tmp = tmp.getNext();
    }
    return tmp.getData();
  }

  public E reverse() {
    this.addFirst(this.getLast());
    this.removeLast();
    Node<E> curr = this.getHead();
    for (int i = 0; i < this.size(); i++) {
      this.addAfter(curr, this.getLast());
      this.removeLast();
      curr = curr.getNext();
    }
    return this.getFirst();
  }

  public E swapE(Node<E> pre, Node<E> curr) {
    Node<E> temp = curr.getNext();
    pre.setNext(temp);
    curr.setNext(temp.getNext());
    temp.setNext(curr);
    return curr.getData();
  }

  @Override
  public void print() {
    if (head != null) {
      Node<E> tmp = head;
      System.out.print("List: " + tmp.getData());
      tmp = tmp.getNext();
      while (tmp != null) {
        System.out.print(" -> " + tmp.getData());
        tmp = tmp.getNext();
      }
      System.out.println();
    } else {
      System.out.println("List is empty!");
    }
  }

  @Override
  public boolean isEmpty() {
    if (numNode == 0) return true;
    return false;
  }

  @Override
  public E getFirst() throws NoSuchElementException {
    if (head == null) {
      throw new NoSuchElementException("Can't get element from an empty list");
    } else {
      return head.getData();
    }
  }

  @Override
  public Node<E> getHead() {
    return head;
  }

  @Override
  public int size() {
    return numNode;
  }

  @Override
  public boolean contains(E item) {
    Node<E> tmp = head;
    while (tmp != null) {
      if (tmp.getData().equals(item)) return true;
      tmp = tmp.getNext();
    }
    return false;
  }
}
