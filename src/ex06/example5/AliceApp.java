package ex06.example5;

abstract class 판사 { // 추상 클래스는 오브젝트가 아니다. 오브젝트가 아니기 때문에 new 할 수 없다.
    public abstract void 심문(); // 몸체가 정해져 있지 않다. 구체적 행위는 오브젝트가 해라. 이런 뜻
} // 얘를 띄우려면 상속을 해서 구체적인 애들을 띄울 때 같이 띄운다.

abstract class 증인 {
    public abstract void 대답(); // abstract를 붙이면 소괄호만 붙인다.
//    public void 대답(){}; // abstract 가 없으면 중괄호까지 붙인다.
}

class 왕 extends 판사 {
    public void 심문() {
        System.out.println("왕은 심문한다.");
    }
}

class 왕비 extends 판사 {
    public void 심문() {
        System.out.println("왕비는 심문한다.");
    }
}

class 모자장수 extends 증인 {
    public void 대답() {
        System.out.println("모자장수는 대답한다.");
    }
}

class 토끼 extends 증인 {
    public void 대답() {
        System.out.println("토끼는 대답한다.");
    }
}

class 엘리스 extends 증인 {
    @Override // 엘리스에 커서 놓고 alt + enter
    public void 대답() {
        System.out.println("엘리스는 대답한다.");
    }
}

public class AliceApp {

    public static void main(String[] args) {
        판사 u1 = new 왕비(); // [판사, 왕비]
        증인 u2 = new 엘리스(); // [증인, 토끼]

        u1.심문();
        u2.대답();
    }
}
