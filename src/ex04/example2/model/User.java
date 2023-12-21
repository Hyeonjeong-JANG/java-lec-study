package ex04.example2.model;

/**
 * 오브젝트를 설계할 때
 * 얘가 오브젝트인가 아닌가
 * 상태값에 직접 초기할 수 있냐? 아니니까 생성자 필요
 * 추후에 상태가 변경될 필요가 있는가? 있으면 메서드 만들고 아니면 말구
 */

public class User {
    final private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
