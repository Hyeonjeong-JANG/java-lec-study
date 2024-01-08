package ex14;

import java.util.Arrays;
import java.util.List;

// 유저 게터세터 만들고
// 메인에 유저 3명 만들고 어레이리스트에 담아서 맵 말고 클래스로 +1로 해보자
class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void changeAge() {
        this.age = this.age - 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StreamEx02 {
    public static void main(String[] args) {
        User u1 = new User("홍길동", 20);
        User u2 = new User("장보고", 15);
        User u3 = new User("임꺽정", 30);

//        ArrayList<User> userArr = new ArrayList<>();
//        userArr.add(u1);
//        userArr.add(u2);
//        userArr.add(u3);

        List<User> userArr = Arrays.asList(u1, u2, u3);
        userArr.stream().map(user -> {
            user.changeAge();
            return user;
        }).toList();
        userArr.forEach(user -> System.out.println(user.getAge()));
    }
}
