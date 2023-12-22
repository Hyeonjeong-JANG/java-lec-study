package ex06.selfStudy2;

class Parent {
    void print() {
        System.out.println("Parent 메소드 호출");
    }
}

class Child extends Parent {
    @Override
    void print() {
        System.out.println("Child 메소드 호출");
    }
}

public class Casting {
    public static void main(String[] args) {
        Parent p = new Child(); // 업 캐스팅: 자식 객체를 부모의 객체로 형변환
        p.print(); // 동적 메소드 호출, 자식의 print() 호출

        // Child c = new Parent(); // 이것은 컴파일 오류이다.

        Child c = (Child) p; // 다운 캐스팅: 부모 객체를 자식의 객체로 형변환, 업 캐스팅을 한 경우에만 사용됨.
        c.print();
    }
}
