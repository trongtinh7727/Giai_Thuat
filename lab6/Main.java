public class Main {

  public static BST createBST(String keys) {
    BST bst = new BST();
    String[] key = keys.split(" ");
    for (String intKey : key) {
      bst.insert(Integer.valueOf(intKey));
    }
    return bst;
  }

  public static void main(String[] args) {
    String s = "12 5 8 9 10 11";
    BST bst = createBST(s);

    bst.NLR(bst.getRoot());
  }
}
