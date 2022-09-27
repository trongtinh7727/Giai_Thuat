import java.util.Scanner;

public class Main {

  public static int rescusive(int num) {
    if (num == 1) {
      return 3;
    }
    return (int) Math.pow(2, num) + num * num + rescusive(num - 1);
  }

  public static int rescusive_stack(MyStack<Integer> Stack_num, int num) {
    int res = 0, rescusive = 0;
    Stack_num.push(3);
    while (num > 1) {
      res = (int) (Math.pow(2, num) + num * num);
      Stack_num.push(res);
      num--;
    }
    while (Stack_num.isEmpty() == false) {
      rescusive += Stack_num.pop();
    }
    return rescusive;
  }

  public static void main(String[] args) {
    MyStack<Fraction> newMyStack = new MyStack<Fraction>();
    MyQueue<Fraction> newMyQueue = new MyQueue<Fraction>();

    System.out.println("---------Bai 1--------");
    System.out.println("Nhap vao so luong phan so: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.printf("Phan so thu: %d\n", i + 1);
      System.out.println("Nhap vao tu so: ");
      int x = sc.nextInt();
      System.out.println("Nhap vao mau so: ");
      int y = sc.nextInt();
      Fraction fraction = new Fraction(x, y);
      newMyStack.push(fraction);
      newMyQueue.enQueue(fraction);
    }
    System.out.println("----------Stack----------");
    newMyStack.print();
    System.out.println("----------Queue----------");
    newMyQueue.print();
    System.out.println();
    System.out.println("----------Bai 2----------");
    System.out.println("Nhap vao n: ");
    n = sc.nextInt();
    System.out.printf(
      "P(%d) = %d",
      n,
      rescusive_stack(new MyStack<Integer>(), n)
    );
  }
}
