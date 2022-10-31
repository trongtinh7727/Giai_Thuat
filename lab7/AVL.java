/**
 * AVL
 */
import java.lang.Math;

public class AVL {

  Node root;

  public Node getRoot() {
    return this.root;
  }

  public void insert(Integer key) {
    root = insert(root, key);
  }

  private Node insert(Node node, Integer key) {
    // 1. Insert
    if (node == null) return new Node(key);
    if (key > node.key) {
      node.right = insert(node.right, key);
    } else if (key < node.key) {
      node.left = insert(node.left, key);
    } else {
      node.counter++;
      return node;
    }

    // 2. Set setHeight
    node.height = 1 + Math.max(setHeight(node.left), setHeight(node.right));

    // 3. Rotate
    int valBalance = checkBlance(node);

    // Kiểm tra 4 TH xảy ra:
    // 3.1. Left left
    if (valBalance > 1 && key < node.left.key) return rightRotate(node);

    // 3.2. Right Right
    if (valBalance < -1 && key > node.right.key) return leftRotate(node);

    // 3.3. Left Right
    if (valBalance > 1 && key > node.left.key) {
      node.left = leftRotate(node.left);
      return rightRotate(node);
    }

    // 3.4. Right Left
    if (valBalance < -1 && key < node.right.key) {
      node.right = rightRotate(node.right);
      return leftRotate(node);
    }
    return node;
  }

  public int setHeight(Node node) {
    if (node == null) return -1;
    return 1 + Math.max(setHeight(node.left), setHeight(node.right));
  }

  public int getHeight(Node node) {
    if (node == null) {
      return -1;
    }
    return node.height;
  }

  private int checkBlance(Node node) {
    int blance = getHeight(node.left) - getHeight(node.right);
    return blance;
  }

  private Node rightRotate(Node node) {
    Node x = node.left;
    node.left = x.right;
    x.right = node;
    node.height = 1 + Math.max(setHeight(node.left), setHeight(node.right));
    x.height = 1 + Math.max(setHeight(x.left), setHeight(x.right));
    return x;
  }

  private Node leftRotate(Node node) {
    Node x = node.right;
    node.right = x.left;
    x.left = node;
    node.height = 1 + Math.max(setHeight(node.left), setHeight(node.right));
    x.height = 1 + Math.max(setHeight(x.left), setHeight(x.right));
    return x;
  }

  public String NLR(Node x) {
    if (x != null) {
      return x.key + " " + NLR(x.left) + NLR(x.right);
    }
    return "";
  }

  public String LNR(Node x) {
    if (x != null) {
      return LNR(x.left) + x.key + " " + LNR(x.right);
    }
    return "";
  }

  public String LRN(Node x) {
    if (x != null) {
      return LRN(x.left) + LRN(x.right) + x.key + " ";
    }
    return "";
  }
}
