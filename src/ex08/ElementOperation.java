package ex08;

public class ElementOperation {
    public static void main(String[] args) {

        // length(): 문자열의 길이 반환
        String str1 = "Hello, World!";
        int length = str1.length();
        System.out.println("문자열의 길이: " + length);

        // toUpperCase(): 문자열을 모두 대문자로 변환
        String str2 = "hello";
        String upperCaseStr = str2.toUpperCase();
        System.out.println("대문자로 변환된 문자열: " + upperCaseStr);

        // toLowerCase(): 문자열을 모두 소문자로 변환
        String str3 = "WORLD";
        String lowerCaseStr = str3.toLowerCase();
        System.out.println("소문자로 변환된 문자열: " + lowerCaseStr);

        // substring(): 문자열의 일부분을 추출
        String str4 = "Hello, World!";
        String subStr = str4.substring(7, 12); // 7번째부터 12번 직전까지
        System.out.println("추출된 문자열: " + subStr);

        // replace(): 문자열 내의 특정 문자나 문자열을 다른 문자열로 대체
        String str5 = "Hello, World!";
        String replacedStr = str5.replace("World", "Java");
        System.out.println("대체된 문자열: " + replacedStr);

        //  trim(): 문자열 앞뒤의 공백을 제거
        String str6 = "            Hello, World!          ";
        String trimmedStr = str6.trim();
        System.out.println("공백이 제거된 문자열: " + trimmedStr);

        // indexOf(): 특정 문자나 문자열이 처음 등장하는 인덱스를 반환합니다.
        String str7 = "Hello, World!";
        int index = str7.indexOf("World");
        System.out.println("문자열의 인덱스: " + index);

        // startsWith(): 주어진 접두사로 시작하는지 여부를 확인
        String str8 = "Hello, World!";
        boolean startsWithHello = str8.startsWith("Hello");
        System.out.println("주어진 접두사로 시작하는지 여부: " + startsWithHello);

        // endsWith(): 주어진 접미사로 끝나는지 여부
        String str9 = "Hello, World!";
        boolean endsWithWorld = str9.endsWith("World!");

        // split(): 문자열을 특정 구분자를 기준으로 나누어 문자열 배열로 반환
        String str10 = "Apple, Banana, Orange";
        String[] fruits = str10.split(", ");
        System.out.println("과일 배열:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
