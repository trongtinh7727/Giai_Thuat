import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

  public StudentComparator() {}

  @Override
  public int compare(Student o1, Student o2) {
    double avg = o1.getAverage() - o2.getAverage();
    if (avg > 0) return 1;
    if (avg < 0) return -1;
    return 0;
  }
}
