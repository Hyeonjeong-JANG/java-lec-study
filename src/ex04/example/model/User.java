package ex04.example.model;

public class User {
    // 모든 객체는 고유 번호를 가져야 한다.
    final int id;
    String name;
    String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
