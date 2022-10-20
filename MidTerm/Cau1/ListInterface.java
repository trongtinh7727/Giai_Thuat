import java.util.NoSuchElementException;

public interface ListInterface {
  public double getFirst() throws NoSuchElementException;

  public void addLast(double item);

  public int CountPositive();

  public void print();

  public Node getHead();
}
