package ex08.example;

public class StringEx02 {
    public static void main(String[] args) {
        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.
        String url = "http://www.naver.com?username=ssar&password=1234";

        // username값과, password값 찾아보기
        String userName;
        String password;

        // 쿼리스트링에서 username과 password를 찾기
        // 쿼리스트링은 ? 이후이니까 ?의 인덱스 위치를 찾아서 거기부터 마지막까지 꺼내자.
        int urlSize = url.length();
        System.out.println(urlSize); // 48
        int questionIndex = url.indexOf("?");
        System.out.println(questionIndex); // 20
        String subStrQuery = url.substring(21, urlSize);
        System.out.println(subStrQuery);

        String[] keys = subStrQuery.split("&");
        System.out.println("keys");
        for (String key : keys) {
            System.out.println(key);
        }

        // 유저네임
        int userNameIndex = keys[0].indexOf("=");
        System.out.println(userNameIndex + 1);
        int userNameSize = keys[0].length();
        userName = keys[0].substring((userNameIndex + 1), keys[0].length());
        System.out.println(userName);

        // 비밀번호
        int passwordIndex = keys[1].indexOf("=");
        System.out.println(passwordIndex + 1);
        int passwordSize = keys[1].length();
        password = keys[1].substring((userNameIndex + 1), keys[1].length());
        System.out.println(password);

        System.out.println("유저네임: " + userName + ", 비밀번호: " + password);
    }
}