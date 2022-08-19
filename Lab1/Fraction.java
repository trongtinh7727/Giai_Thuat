public class Fraction {

  private int number;
  private int denmo;

  public Fraction() {
    this.number = 0;
    this.denmo = 1;
  }

  public Fraction(int x, int y) {
    this.number = x;
    this.denmo = y;
  }

  public Fraction(Fraction f) {
    this.number = f.number;
    this.denmo = f.denmo;
  }

  public String toString() {
    return String.format(
      "Fraction[number: %d, denom: %d]",
      this.number,
      this.denmo
    );
  }

  public boolean equals(Object f) {
    if (this == f) {
      return true;
    }
    if (f instanceof Fraction) {
      Fraction temp = (Fraction) f;
      if (temp.number == this.number && temp.denmo == this.denmo) {
        return true;
      }
    }
    return false;
  }
}
