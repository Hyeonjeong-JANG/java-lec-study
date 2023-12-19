package ex04.test;

public class ScopeEx01 {

    int n1 = 1;// heap
    static int n2 = 2; //static

    static void m1() {
        int n1 = 10;//stack
        System.out.println("m1: " + n1); // 위에 int n1 = 10; 이 없다면 아무 것도 화면에 보여줄 수 없다. 5행의 int n1 = 1;은 static에 올라와 있지 않기 때문이다.
    }

    void m2() {
        System.out.println("m2: " + n1);
    }

    // 메인 시작 전에 static에 변수 n2와 메서드 m1이 로드되어 있음.
    public static void main(String[] args) {
        System.out.println(1);
        m1(); // return이 있으면 여기로 오고, 없으면 다음 줄로 간다.
        System.out.println(2);
        ScopeEx01 sc = new ScopeEx01(); // static이 붙어 있지 않은 모든 것이 뜸. 그냥 남는 공간 찾아서 뜸. // main stack에 뜬 sc는 heap의 주소.(참조 변수)
        System.out.println(sc.n1);
        sc.m2();

        // heap과 static은 떠있기만 하다면 어디서든 찾을 수 있어. 어차피 이름은 중복되지 않을테니까.
    }
}
