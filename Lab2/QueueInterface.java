public interface QueueInterface<E> {
  public void enQueue(E item);

  public E deQueue();

  public int size();

  public boolean constains(E item);

  public void print();

  public boolean isEmpty();

  public E getFront();
}
