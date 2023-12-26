package ex07.programming.ex08;

/**
 * 객체의 어떤 값을 반환하는 메소드 double getValue()가 포함한 GetInfo 인터페이스를 정의한다.
 * 이어서 GetInfo 인터페이스를 구현하는 Student 클래스를 작성한다. Student 클래스에서 GetValue() 메소드는 학생의 학점을 반환한다.
 * 각 객체들의 getValue()를 호출하여서 평균값을 계산하는 double average(GetInfo[] objects) 메소드를 구현한다.
 * 이 메소드를 이용하여 학생들의 평균 성적을 계산해 보자.
 */

// 객체의 어떤 값을 반환하는 메소드 double getValue()가 포함한 GetInfo 인터페이스를 정의한다.
interface GetInfo {
    double getValue(int score);
}

// 이어서 GetInfo 인터페이스를 구현하는 Student 클래스를 작성한다. Student 클래스에서 GetValue() 메소드는 학생의 학점을 반환한다.
class Student implements GetInfo {
    double score;

    public Student(double score) {
        this.score = score;
    }

    @Override
    public double getValue(int score) {
        return (this.score = score);
    }


};


public class StudentScoreTest {
    public static void main(String[] args) {
        // 각 객체들의 getValue()를 호출하여서 평균값을 계산하는 double average(GetInfo[] objects) 메소드를 구현한다.
        double[] studentScore = new double[3];
        Student s1 = new Student(80.5);
        Student s2 = new Student(90.5);
        Student s3 = new Student(70.5);

        studentScore[0] = s1.score;
        studentScore[1] = s2.score;
        studentScore[2] = s3.score;

        System.out.println(studentScore[0]);
        System.out.println(studentScore[1]);
        System.out.println(studentScore[2]);
    }
}