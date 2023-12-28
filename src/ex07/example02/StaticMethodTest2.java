package ex07.example02;

interface Employable {
    String getName();

    static boolean isEmpty(String str) {
        if ((str == null) || (str.trim().length() == 0)) { // str이 비어있거나 str에서 양쪽 공백을 제거한 것의 길이가 0이면  
            return true; // 리턴 트루
        } else { // 아니면
            return false; // 리턴 폴스
        }
    }
};

class Employee implements Employable {
    private String name;

    public Employee(String name) {
        if (Employable.isEmpty(name) == true) {
            throw new RuntimeException("이름은 반드시 입력하여야 함!");
        }
        this.name = name;
    }


    @Override
    public String getName() {
        return this.name;
    }
};


public class StaticMethodTest2 {
    public static void main(String[] args) {
        Employable employee1 = new Employee("홍길동");
        Employable employee2 = new Employee("");

    }
};
