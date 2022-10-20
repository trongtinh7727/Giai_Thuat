public class Student {

  private String name;
  private double mathematics;
  private double programming;
  private double DSA1;
  private double average;

  public Student(
    String name,
    double mathematics,
    double programming,
    double DSA1
  ) {
    this.name = name;
    this.DSA1 = DSA1;
    this.mathematics = mathematics;
    this.programming = programming;
    this.average = (this.DSA1 + this.mathematics + this.programming) / 3.0;
  }

  public double getAverage() {
    return average;
  }

  public double getDSA1() {
    return DSA1;
  }

  public double getMathematics() {
    return mathematics;
  }

  public String getName() {
    return name;
  }

  public double getProgramming() {
    return programming;
  }

  public void setAverage(double average) {
    this.average = average;
  }

  public void setDSA1(double dSA1) {
    DSA1 = dSA1;
  }

  public void setMathematics(double mathematics) {
    this.mathematics = mathematics;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setProgramming(double programming) {
    this.programming = programming;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return String.format("Student: %s |  AVG:  %.2f\n", name, this.average);
  }
}
