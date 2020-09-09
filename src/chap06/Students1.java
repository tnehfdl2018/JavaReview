package chap06;

public class Students1 {

  public static int serialNum = 1000;
  public int studentID;
  public String studentName;
  public int grade;
  public String address;

  public Students1() {
    serialNum++;
    studentID = serialNum;

  }
  public String getStudentName() {
    return studentName;
  }
  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }
}
