public class ex4 {

  public static int recur_fct(int n) {
    if (n == 1) return n; else return recur_fct(n - 1) * n;
  }

  public static int ex4_a(int n) {
    if (n == 1) return 3; else return 2 * n + 1 + ex4_a(n - 1);
  }

  public static int ex4_b(int n) {
    if (n == 1) return 1; else return ex4_b(n - 1) + recur_fct(n);
  }

  public static int ex4_c(int n) {
    if (n == 1) return 1; else return ex4_b(n - 1) * recur_fct(n);
  }
}
