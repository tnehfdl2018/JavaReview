package chap05;

public class Student {

  int studentID;
  private String studentName;
  int grade;
  String address;

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public void showStudentInfo() {
    System.out.println(studentName + ", " + address);
  }

  public String getStudentName() {
    return studentName;
  }

  public static void main(String[] args) {
    Student studentAhn = new Student();
    studentAhn.studentName = "안연수";

    System.out.println(studentAhn.studentName);
    System.out.println(studentAhn.getStudentName());
  }
}
