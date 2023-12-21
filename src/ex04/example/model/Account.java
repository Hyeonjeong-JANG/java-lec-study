package ex04.example.model;

public class Account {
    public final int id; // 계좌 번호(제약 조건: 숫자 4자리로 만들어져 있다.) 지금은 4자리니까 int로 했다. 계좌 번호는 번호지만 그 길이가 길기 때문에 String으로 만든다. 연산할 일이 없으니까.
    // final을 하려면 반드시 그 값이 초기화 되어야 한다. 그렇지 않으면 오류가 난다.
    public long balance; //  int로 만들면 21억 얼마만 들어가기 때문에 long으로 해야 한다.
    public int userId;

    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() { // 객체 내부의 값을 출력할 때 toString을 만들어 두면 편함
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
