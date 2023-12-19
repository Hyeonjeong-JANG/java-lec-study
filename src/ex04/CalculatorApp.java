package ex04;

// 메서드는 호출될 때만 열린다.
// 메서드를 호출하면 호출문이 메서드의 리턴값으로 바뀐다.
// 메서드 안에 메서드를 만들 수 없다.
// 자바 문법에서 모든 것은 class안에 만들어져야 한다.

// 계산기 클래스 = 설계도
public class CalculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); // new를 하면 static이 없는 모든 애가 다 뜬다.
//        int addResult = cal.add(50, 80);
//        System.out.println("50 + 80 = "+ addResult);
//        int minusResult = cal.minus(50, 80);
//        System.out.println("50 - 80 = "+ minusResult);
//        int divideResult = cal.divide(50, 80);
//        System.out.println("50 / 80 = "+ divideResult);
//        int multiResult = cal.multi(50, 80);
//        System.out.println("50 * 80 = "+ multiResult);

        int n1 = 50;
        int n2 = 80;
        int addResult = cal.add(n1, n2);
        int minusResult = cal.minus(n1, n2);
        double divideResult = cal.divide(n1, n2);
        int multiResult = cal.multi(n1, n2);
        System.out.println(n1 + " + " + n2 + " = " + addResult);
        System.out.println(n1 + " - " + n2 + " = " + minusResult);
        System.out.println(n1 + " / " + n2 + " = " + divideResult);
        System.out.println(n1 + " * " + n2 + " = " + multiResult);
    }
}
