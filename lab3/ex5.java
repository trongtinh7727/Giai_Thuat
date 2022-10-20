public class ex5 {

  public static String ConvertDtoB(int n, int base) {
    String[] index = {
      "0",
      "1",
      "2",
      "3",
      "4",
      "5",
      "6",
      "7",
      "8",
      "9",
      "A",
      "B",
      "C",
      "D",
      "E",
      "F",
    };
    if (n == 1) {
      return "1";
    }
    return ConvertDtoB(n / base, base) + index[n % base];
  }
}
