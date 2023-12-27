package ex08.example;

public class StringEx01 {
    public static String encoding(String data) {
        return "";
    }

    public static String decoding(String encodingData) {
        return "";
    }

    // 데이터를 인코딩, 디코딩 하는 작업
    // 주어진 문자열의 첫 번째 글자가 몇 개이고 그게 몇 번째까지 같은지 확인.
    // 달라지면 그 달라지는 글자가 뭔지 확인
    
    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD";
        int dataSize = data.length();
//        System.out.println(dataSize);
        char orderChar = data.charAt(0);
//        System.out.println(orderChar);

        int count = 0;
        char char01 = 0, char02 = 0;

        for (int i = 0; i < dataSize; i++) {
            if (data.charAt(0) == data.charAt(i)) {
                char01 = data.charAt(0);
                count++;
            }
            if (data.charAt(0) != data.charAt(i)) {
                System.out.println(data.charAt(i));
            }
        }

        System.out.print("문자 " + char01 + "는 ");
        System.out.println(count + "개");

        String convert = "A2B3C4D5"; // Byte -> 8Byte

    }
}