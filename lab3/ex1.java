public class ex1 {

  public static int Factorial(int n) {
    int res = 1;
    while (n > 1) {
      res *= n;
      n--;
    }
    return res;
  }

  public static int PowX(int x, int n) {
    int res = x;
    while (n > 1) {
      res = res * x;
      n--;
    }
    return res;
  }

  public static int CountNumber(int n) {
    int count = 1;
    while (n > 10) {
      count++;
      n /= 10;
    }
    return count;
  }

  public static boolean CheckPrime(int n) {
    int count = 0;
    for (int i = 2; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    if (count != 1) {
      return false;
    }
    return true;
  }

  public static int GDC(int a, int b) {
    int gdc = 1;
    for (int i = 1; i <= a; i++) {
      if (a % i == 0 && b % i == 0) {
        gdc = i;
      }
    }
    return gdc;
  }
}
