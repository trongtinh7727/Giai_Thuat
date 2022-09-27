public class Fraction {

  private int number;
  private int denom;

  public Fraction() {
    this.number = 0;
    this.denom = 1;
  }

  public Fraction(int x, int y) {
    this.number = x;
    this.denom = y;
  }

  public Fraction(Fraction f) {
    this.denom = f.denom;
    this.number = f.number;
  }

  @Override
  public String toString() {
    return String.format("%d/%d", this.number, this.denom);
  }

  @Override
  public boolean equals(Object f) {
    // TODO Auto-generated method stub
    return super.equals(f);
  }
}
