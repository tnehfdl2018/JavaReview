package chap06;

public class StudentsTest2 {

  public static void main(String[] args) {
    Students1 studentLee = new Students1();
    studentLee.setStudentName("이지원");
    System.out.println(studentLee.serialNum);
    System.out.println(studentLee.studentName + " 학번 : " + studentLee.studentID);

    Students1 studentSon = new Students1();
    studentSon.setStudentName("손수경");
    System.out.println(studentSon.serialNum);
    System.out.println(studentSon.studentName + " 학번 : " + studentSon.studentID);
  }
}
