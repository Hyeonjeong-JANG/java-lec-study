package ex04;

class Person2{
    int age = 10;
    char gender = '남';
}

//char gender = '남';// 클래스 밖에는 뭘 적을 수 없음

public class MemEx02 {
    public static void main(String[] args) {
        System.out.println("1년 지남"); // Person2는 여기선 없음
        System.out.println("2년 지남"); // Person2는 여기선 없음
        System.out.println("3년 지남"); // Person2는 여기선 없음
        // Person2는 여기선 없음
        Person2 p2 = new Person2(); // 여기서 heap을 띄우면 적어도 1, 2, 3년 동안은 떠있지 않으니 효율적이야.
        // heap에 띄울 때는 클래스 이름이 타입이야.Person2
        // new는 동적 할당을 하겠다는 뜻!
        // static은 클래스명을 쓰고 바로 쓸 수 있지만
        // heap은 변수가 필요해. 여러번 불러올 수 있으니까.

        System.out.println(p2.age);
        System.out.println(p2.gender);
        System.out.println("메인 종료");
    }
}
