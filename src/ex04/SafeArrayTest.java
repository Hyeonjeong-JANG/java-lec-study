package ex04;

class SafeArray {
    private int a[]; //배열을 하나 선언했어. 그런데 길이도 모르고 뭐 그런 것 같아.
    public int length; // 길이라는 int변수도 하나 선언했어.

    public SafeArray(int size) { // SafeArray의 매개변수로 size를 넣으면 a와 length의 값에 각각 반영이 돼. // 3
        a = new int[size]; // a = new int[3];// 0 1 2
        length = size; // length = 3;
    }

    public int get(int index) { // get으로 private의 값을 받아와서 다음과 같이 리턴한다. 인덱스가 0 이상이고, 인덱스보다 length가 크면 a[index]를 리턴하고 아니고 -1을 리턴한다.
        if (index >= 0 && index < length) { // index>=0 and index<3
            return a[index];// return a[index]
        }
        return -1;
    }

    public void put(int index, int value) { // index와 value를 put의 매개변수로 받는다. //
        if (index >= 0 && index < length) { // 인덱스의 값이 0 상이고 인덱스보다 length가 크면
            a[index] = value; // 이렇게
        } else {
            System.out.println("잘못된 인덱스 " + index); // 아니면 이렇게 한다.
        }
    }
}

public class SafeArrayTest {
    public static void main(String[] args) {
        SafeArray array = new SafeArray(3); // SafeArray는 int를 매개 변수로 받는 메서드이기 때문에 괄호 안에 int 값을 넣어 줘야 한다.

        for (int i = 0; i < (array.length + 1); i++) {
            array.put(i, i * 10); // 0 0   1 10   2 20
        }
    }
}
