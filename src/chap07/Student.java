package chap07;

import java.util.ArrayList;

public class Student {

  public int studentId;
  public String studentName;
  public ArrayList<Subject> subjectArray = null;

  public Student(int studentId, String studentName) {
    this.studentId = studentId;
    this.studentName = studentName;
    subjectArray = new ArrayList<>();
  }

  public void addSubject(String subjectName, int score) {

    Subject subject = new Subject();
    subject.setSubjectName(subjectName);
    subject.setScore(score);
    subjectArray.add(subject);
  }

  public void showStudentInfo() {
    int total = 0;
    for (Subject subject : subjectArray) {
      total += subject.getScore();
      System.out.println(studentName + "의 " + subject.getSubjectName() + "과목의 성적은 " + subject.getScore() + "입니다.");
    }
    System.out.println("총점 : " + total);
  }
}
