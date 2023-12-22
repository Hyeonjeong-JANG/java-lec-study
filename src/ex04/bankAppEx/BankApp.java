package ex04.bankAppEx;

import ex04.bankAppEx.model.Account;
import ex04.bankAppEx.model.User;

public class BankApp {
    public static void main(String[] args) {
//        long amount;

        // 유저 만들기
        User ssar = new User(1, "ssar", "01011111111");
        User cos = new User(2, "cos", "01022222222");
        User love = new User(2, "love", "01033333333");

        // 계좌 만들기
        Account ssarAccount = new Account(1111, 100000, 1);
        Account cosAccount = new Account(2222, 200000, 2);
        Account loveAccount = new Account(3333, 300000, 3);

        ssarAccount.출금(500);
        System.out.println(ssarAccount);

        cosAccount.입금(300);
        System.out.println(cosAccount);

//        BankService.이체(ssarAccount, lovseAccount, 200000);
//        System.out.println(ssarAccount);
//        System.out.println(loveAccount);
    }
}
