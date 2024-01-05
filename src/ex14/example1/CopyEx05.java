package ex14.example1;

import java.time.LocalDateTime;

// Data Transfer Object
class JoinDTO {
    private String userName;
    private String password;
    private String email;

    public JoinDTO(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

class Member {
    private int no;
    private String userName;
    private String password;
    private String email;
    private LocalDateTime createdAt;

    public Member(int no, JoinDTO dto) {
        this.no = no;
        this.userName = dto.getUserName();
        this.password = dto.getPassword();
        this.email = dto.getEmail();
        this.createdAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Member{" +
                "no=" + no +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

public class CopyEx05 {
    public static void main(String[] args) {
        JoinDTO d1 = new JoinDTO("ssar", "1234", "ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos", "1234", "cos@nate.com");

//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//        System.out.println(now.plusDays(365 * 5));
//        now = now.plusDays(365 * 5);
//        System.out.println(now);
        // 목적: d1을 Member로 옮기고 d2를 Member로 옮긴다.
        // 뉴를해서 멤버로 옮겼다가 저장하면 자동으로 no가 생성된다. 오토인크리먼트 // 회원가입된 시간도 자동으로 받아져
        // 객체를 복사해서 no랑 가입시간이랑 받아서 그걸 다시 조인디

        // 클래스에 있는 데이터를 다른 데이터로 옮겨 담는 방법
        Member m1 = new Member(1, d1);
        Member m2 = new Member(2, d2);
        System.out.println(m1);
    }
}
