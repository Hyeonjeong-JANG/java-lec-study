package ex04.bankAppEx.model;

public class Account {

    private final int id; // 계좌
    private long balance;
    private int userId;

    public boolean 잔액부족하니(long amount) {
        if (balance < amount) {
            return true;
        }
        return false;
    }

    public void 출금(long amount) {
        this.balance = this.balance - amount;
    }// this.balance와 차이가 있나 보자.

    public void 입금(long amount) {
        this.balance = this.balance + amount;
    }

    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
