package lab3;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Ex4
    System.out.println("----Ex 4----");
    System.out.print("~~~Input n = ");
    int n = sc.nextInt();
    System.out.printf("a) S = %d\n", ex4.ex4_a(n));
    System.out.printf("b) S = %d\n", ex4.ex4_b(n));
    System.out.printf("c) S = %d\n", ex4.ex4_c(n));

    //Ex5

    System.out.println("----Ex 5----");
    System.out.println("Enter number:");
    n = sc.nextInt();
    System.out.println("Enter base:");
    int base = sc.nextInt();
    System.out.printf(
      "%d in base %d = %s\n",
      n,
      base,
      ex5.ConvertDtoB(n, base)
    );

    //Ex6
    System.out.println("----Ex 6----");
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    n = 6;
    System.out.printf("a) The minimum = %d\n", ex6.Ex6a(arr, n));
    System.out.printf("b) Sum = %d\n", ex6.Ex6b(arr, n));
    System.out.printf("c) S = %d\n", ex6.Ex6c(arr, n));
  }
}
