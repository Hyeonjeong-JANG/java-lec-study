package ex04;

public class MyMath {

    // 매개 변수가 다르면 메소드 이름은 같아 된다.(메소드 중복 정의)
    int add(int x, int y) {
        return x + y;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }

    int add(int x, int y, int z, int w) {
        return x + y + z + w;
    }

    public static void main(String[] args) {
        MyMath obj;
        obj = new MyMath();
        System.out.print(obj.add(10, 20) + " ");
        System.out.print(obj.add(10, 20, 30) + " ");
        System.out.print(obj.add(10, 20, 30, 40));
    }
}
