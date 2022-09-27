import java.util.Scanner;

public class Ex3_6 {

  //Ex-3
  public static void reverseString(String string) {
    MyStack<Character> stack = new MyStack<>();
    for (int i = 0; i < string.length(); i++) {
      stack.push(string.charAt(i));
    }
    stack.print();
  }

  //Ex-4
  public static boolean checkBalanced(String f) {
    MyStack<Character> stack = new MyStack<>();
    for (int i = 0; i < f.length(); i++) {
      Character character = f.charAt(i);
      switch (character) {
        case '(':
        case '{':
        case '[':
          stack.push(character);
          break;
        case ')':
          if (stack.getPeek().equals('(')) {
            stack.pop();
          } else {
            return false;
          }
          break;
        case '}':
          if (stack.getPeek().equals('{')) {
            stack.pop();
          } else {
            return false;
          }
          break;
        case ']':
          if (stack.getPeek().equals('[')) {
            stack.pop();
          } else {
            return false;
          }
          break;
        default:
          break;
      }
    }
    if (stack.isEmpty()) {
      return true;
    }
    return false;
  }

  //Ex-6
  public static boolean palindrome(String str) {
    //getEachChar
    MyQueue<Character> queue = new MyQueue<>();
    MyStack<Character> stack = new MyStack<>();
    char tmp;
    for (int i = 0; i < str.length(); i++) {
      tmp = str.charAt(i);
      if (Character.isLetter(tmp)) {
        stack.push(tmp);
        queue.enQueue(tmp);
      }
    }
    //checkPalindrome
    while (!stack.isEmpty()) {
      Character chars = stack.pop();
      Character charq = queue.deQueue();
      if (!chars.equals(charq)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("----EX 3----");
    System.out.println("Enter sequence: ");
    String s = sc.nextLine();
    System.out.println("Reverse: ");
    reverseString(s);
    System.out.println("----EX 4----");
    System.out.println("Enter sequence: ");
    s = sc.nextLine();
    if (checkBalanced(s)) {
      System.out.println("This is a Balanced");
    } else {
      System.out.println("This is not a Balanced");
    }
    System.out.println("----EX 5----");
    QueueByStack<Integer> queue = new QueueByStack<>();
    queue.enQueue(1);
    queue.enQueue(2);
    queue.enQueue(3);
    queue.enQueue(4);
    queue.enQueue(5);
    queue.print();
    System.out.println("Contains 1:" + queue.constains(1));
    System.out.println(queue.getFront());
    queue.deQueue();
    System.out.println("Aqueueter deQueue:");
    queue.print();
    System.out.println("Contains 1:" + queue.constains(1));
    System.out.println("Contains 0:" + queue.constains(0));
    System.out.println(queue.getFront());
    System.out.println();
    System.out.println("----EX 6----");
    System.out.println("Enter sequence: ");
    s = sc.nextLine();
    if (palindrome(s)) {
      System.out.println("This is a palindrome");
    } else {
      System.out.println("This is a palindrome");
    }
  }
}
