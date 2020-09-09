package chap06;

public class StudentsTest1 {

  public static void main(String[] args) {
    Students studentLee = new Students();
    studentLee.setStudentName("이지원");
    System.out.println(studentLee.serialNum);
    studentLee.serialNum++;

    Students studentSon = new Students();
    studentSon.setStudentName("손수경");
    System.out.println(studentSon.serialNum);
    System.out.println(studentLee.serialNum);
  }
}
