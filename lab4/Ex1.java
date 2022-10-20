/**
 * InsertionSort
 */
public class Ex1 {

  public static void InsertionSort(int A[]) {
    for (int i = 1; i < A.length; i++) {
      int next = A[i];
      int j;
      for (j = i - 1; j >= 0 && A[j] > next; j--) {
        A[j + 1] = A[j];
      }
      A[j + 1] = next;
    }
  }

  public static void BubbleSort(int A[]) {
    for (int i = 0; i < A.length - 1; i++) {
      for (int j = 0; j < A.length - i - 1; j++) {
        if (A[j + 1] < A[j]) {
          int temp = A[j];
          A[j] = A[j + 1];
          A[j + 1] = temp;
        }
      }
    }
  }

  public static void SelectionSort(int A[]) {
    for (int i = 0; i < A.length - 1; i++) {
      int min_index = i;
      for (int j = i + 1; j < A.length; j++) {
        if (A[j] < A[min_index]) {
          min_index = j;
        }
      }
      int temp = A[i];
      A[i] = A[min_index];
      A[min_index] = temp;
    }
  }

  public static void main(String[] args) {
    int A[] = { 2, 3, 6, 2, 7, 1, 7, 78, 23, 11, 0 };
    // InsertionSort(A);
    BubbleSort(A);
    // SelectionSort(A);
    // System.out.println(A);
    for (int i = 0; i < A.length; i++) {
      System.out.println(A[i]);
    }
  }
}
