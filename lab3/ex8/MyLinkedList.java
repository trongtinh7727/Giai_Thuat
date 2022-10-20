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

  // ------------------------//

  public int CountEven() {
    int dem = 0;
    Node<E> tmp = head;
    if (tmp != null) {
      while (tmp != null) {
        if ((int) tmp.getData() % 2 == 0) {
          dem++;
        }
        tmp = tmp.getNext();
      }
    }
    return dem;
  }

  static boolean isPrime(int n) {
    // Corner case
    if (n <= 1) return false;

    // Check from 2 to n-1
    for (int i = 2; i < n; i++) if (n % i == 0) return false;

    return true;
  }

  public int CountPrime() {
    int dem = 0;
    Node<E> tmp = head;
    if (tmp != null) {
      while (tmp != null) {
        if (isPrime((int) (tmp.getData()))) {
          dem++;
        }
        tmp = tmp.getNext();
      }
    }
    return dem;
  }

  public E addBefore(E item) throws NoSuchElementException {
    if (head == null) {
      throw new NoSuchElementException("No even element");
    } else if ((int) head.getData() % 2 == 0) {
      addFirst(item);
      return head.getData();
    } else {
      Node<E> preNode = null;
      Node<E> currNode = head;
      while (currNode.getNext() != null) {
        if ((int) currNode.getData() % 2 == 0) {
          preNode.setNext(new Node<E>(item, currNode));
          numNode++;
          return preNode.getNext().getData();
        }
        preNode = currNode;
        currNode = currNode.getNext();
      }
      throw new NoSuchElementException("No even element");
    }
  }

  public E maxValue() throws NoSuchElementException {
    if (head == null) {
      throw new NoSuchElementException("List is empty!");
    } else {
      Node<E> temp = head;
      Node<E> max = head;

      while (temp.getNext() != null) {
        if ((int) temp.getData() > (int) max.getData()) {
          max = temp;
        }
        temp = temp.getNext();
      }
      return max.getData();
    }
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

  public E addSortedList(E item) {
    if (head == null || (int) item < (int) head.getData()) {
      head = new Node<E>(item, head);
      numNode++;
    } else {
      Node<E> tmp = head;
      Node<E> prev = head;
      while (tmp != null) {
        if ((int) tmp.getData() > (int) item) {
          Node<E> newNode = new Node<E>(item, tmp);
          prev.setNext(newNode);
          numNode++;
          break;
        }
        prev = tmp;
        if (tmp.getNext() == null) {
          Node<E> newNode = new Node<E>(item, null);
          tmp.setNext(newNode);
          numNode++;
          break;
        }
        tmp = tmp.getNext();
      }
    }
    return this.getFirst();
  }

  public int Sum() {
    if (this.isEmpty()) {
      System.out.println("Can't remove element from an empty list");
    } else {
      Node<E> tmp = this.head;
      int sum = 0;
      while (tmp != null) {
        sum += (int) tmp.getData();
        tmp = tmp.getNext();
      }
      return sum;
    }
    return 0;
  }
}
