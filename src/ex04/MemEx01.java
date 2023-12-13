package ex04;

class Person1{// 커스텀 자료형
    static int age = 20;
    static char gender = '여';
}

public class MemEx01 {
    public static void main(String[] args) {
        System.out.println(Person1.age);
        System.out.println(Person1.gender);
    }
}
/**
 * JVM은 세 개의 공간으로 나뉘어 있다. (static, , )
 * 1. JVM이 실행될 때 제일 처음으로 static을 찾는다.
 * static(정적 할당)은 main이 실행되기 전에 메모리에 뜬다.
 * main이 실행되는 도중에 static을 추가할 수는 없다.
 * main이 끝나야 사라져.
 * 그래서 static의 생명주기가 제일 길다.
 *
 * main이 실행되는 도중에 추가하고 싶다면? --> heap(동적 할당)
 * 왜 정적, 동적을 나눠서 할당할까? --> 메모리를 효율적으로 활용하기 위해서.
 *  * 메모리는 값이 비싸고 공간이 한정되어있잖아.
 */
