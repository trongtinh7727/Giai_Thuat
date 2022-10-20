import java.util.Arrays;

public class Main {

  public static void print(Student[] students) {
    for (Student student : students) {
      System.out.print(student);
    }
  }

  public static void main(String[] args) {
    Student[] students = new Student[5];
    students[0] = new Student("Tan", 9, 7, 5);
    students[1] = new Student("Tinh", 9, 10, 6.5);
    students[2] = new Student("Phuc", 8, 7, 6.5);
    students[3] = new Student("Dung", 9, 9, 6.5);
    students[4] = new Student("Tien", 9, 10, 6.5);
    print(students);
    System.out.println("----Sort----");
    Arrays.sort(students, new StudentComparator());
    print(students);
  }
}
