public class Sort {

  public static void selectionSort(int a[], int n) {
    for (int i = 0; i < n - 1; i++) {
      int min = i;

      for (int j = i + 1; j < n; j++) {
        if (a[j] < a[min]) {
          min = j;
        }
        printArray(a);
        System.out.printf(" | i=%d, j = %d,min = %d\n", i, j, min);
      }
      int temp = a[min];
      a[min] = a[i];
      a[i] = temp;
    }
  }

  public static void insertionSort(int a[], int n) {
    for (int i = 1; i < n; i++) {
      int next = a[i];
      int j;
      for (j = i; (j > 0) && (a[j - 1] > next); j--) {
        a[j] = a[j - 1];
        printArray(a);
        System.out.printf(" | i=%d, j = %d, next = %d\n", i, j, next);
      }
      a[j] = next;
    }
  }

  public static void BubbleSort(int a[], int n) {
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        printArray(a);
        System.out.printf(" | i=%d, j = %d\n", i, j);
        if (a[j] > a[j + 1]) {
          // the larger item bubbles down
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }
  }

  public static void quickSort(int a[], int left, int right) {
    int pivot = a[(left + right) / 2];
    int l = left, r = right;
    do {
      while (a[l] < pivot) l++;
      while (a[r] > pivot) r--;
      printArray(a);
      System.out.printf(" | l=%d, pivot = %d, r = %d\n", l, pivot, r);
      if (l <= r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
        l++;
        r--;
      }
    } while (l <= r);
    if (left < r) quickSort(a, left, r);
    if (l < right) quickSort(a, l, right);
  }

  public static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
    // System.out.println();
  }

  public static void main(String[] args) {
    int[] select = { 6, 8, 12, 32, 43, 1 };
    int[] insertionSort = { 11, 7, 6, 23, 29 };
    int[] bubble = { 4, 6, 3, 2, 9, 1 };

    // selectionSort(select, select.length);
    // insertionSort(insertionSort, insertionSort.length);
    printArray(bubble);
    System.out.println();
    quickSort(bubble, 0, bubble.length - 1);
    printArray(bubble);
  }
}
