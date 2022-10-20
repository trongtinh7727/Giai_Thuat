public class BST {

  Node root;

  public BST() {
    this.root = null;
  }

  public Node getRoot() {
    return root;
  }

  public void insert(Integer key) {
    root = insert(root, key);
  }

  private Node insert(Node x, Integer key) {
    if (x == null) {
      return new Node(key);
    }
    int cmp = key.compareTo(x.key);
    if (cmp < 0) {
      x.left = insert(x.left, key);
    } else if (cmp > 0) {
      x.right = insert(x.right, key);
    } else {
      x.key = key;
    }
    return x;
  }

  public void NLR(Node x) {
    if (x != null) {
      System.out.print(x.key + " ");
      NLR(x.left);
      NLR(x.right);
    }
  }
}
