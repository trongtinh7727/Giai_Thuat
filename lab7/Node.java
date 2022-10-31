/**
 * Node
 */
public class Node {

  Integer key;
  Node left, right;
  int height, counter;

  public Node(Integer key) {
    this.key = key;
    this.height = 0;
    this.counter = 1;
    this.left = this.right = null;
  }
}
