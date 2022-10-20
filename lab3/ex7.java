public class ex7 {

  public static int Min(int a, int A[]) {
    if (a == 1) {
      return A[a - 1];
    }
    if (A[a - 1] < A[a - 2]) {
      int temp = A[a - 1];
      A[a - 1] = A[a - 2];
      A[a - 2] = temp;
    }
    return Min(a - 1, A);
  }

  public static int Sum(int a, int A[]) {
    if (a == 0) {
      return 0;
    }
    return Sum(a - 1, A) + A[a - 1];
  }

  public static int CountEven(int a, int A[]) {
    if (a == 0) {
      return 0;
    }
    if (A[a - 1] % 2 == 0) {
      return CountEven(a - 1, A) + 1;
    }
    return CountEven(a - 1, A);
  }

  public static void main(String[] args) {
    int a[] = { 1, 2, 5, 7, 9 };
    int size = 5;
    System.out.println("Array:");
    for (int i : a) {
      System.out.printf("%d ", i);
    }
    System.out.println();
    System.out.printf("Min of array: %d\n", Min(size, a));
    System.out.printf("Sum of array: %d\n", Sum(size, a));
    System.out.printf(
      "The number of elements of the array: %d\n",
      CountEven(size, a)
    );
  }
}
