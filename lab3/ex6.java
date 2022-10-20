public class ex6 {

  //ex6a
  public static int Ex6a(int[] a, int n) {
    int min = a[0];
    for (int i = 0; i < n; i++) {
      if (a[i] < min) min = a[i];
    }
    return min;
  }

  //ex6b
  public static int Ex6b(int[] a, int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += a[i];
    }
    return sum;
  }

  //ex6c
  public static int Ex6c(int[] a, int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] % 2 == 0) count++;
    }
    return count;
  }
}
