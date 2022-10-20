public class ex2 {

  public static int Factorial(int n) {
    if (n == 1) {
      return 1;
    }
    return n * Factorial(n - 1);
  }

  public static int PowX(int x, int n) {
    if (n == 0) {
      return 1;
    }
    return PowX(x, n - 1) * x;
  }

  public static int CountNumber(int n) {
    if (n < 10) {
      return 1;
    }
    return CountNumber(n - 1) + 1;
  }

  public static int GDC(int a, int b) {
    if (b == 0) {
      return a;
    }
    return GDC(b, a % b);
  }
}
