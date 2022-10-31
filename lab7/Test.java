import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Test {

  public static String readFile() {
    String data = "";
    try {
      File input = new File("input.txt");
      Scanner myReader = new Scanner(input);
      data = myReader.nextLine();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return data;
  }

  public static void addNumbers(AVL tree, String numberString) {
    String[] numerbers = numberString.split(" ");
    for (String number : numerbers) {
      tree.insert(Integer.parseInt(number));
    }
  }

  public static void main(String[] args) {
    String numbers = readFile();
    AVL tree = new AVL();
    addNumbers(tree, numbers);

    // Read file
    try {
      FileWriter myWriter = new FileWriter("output.txt");
      // NLR
      myWriter.write(tree.NLR(tree.getRoot()) + "\n");
      // LNR
      myWriter.write(tree.LNR(tree.getRoot()) + "\n");
      // LRN
      myWriter.write(tree.LRN(tree.getRoot()) + "\n");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
