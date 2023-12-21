package ex04.example2;

import ex04.example2.model.Account;
import ex04.example2.model.User;

public class BankApp {
    public static void main(String[] args) {
        // 1. 고객 2명 만들기
        User ssar = new User(1, "ssar", "ssar@gmail.com");
        User cos = new User(2, "cos", "coss@gmail.com");
        User love = new User(3, "love", "love@gmail.com");

        // 2. 계좌 2개 만들기
        Account ssarAccount = new Account(1111, 10000, 1);
        Account cosAccount = new Account(2222, 10000, 2);
        Account loveAccount = new Account(3333, 10000, 3);
        // 3. 고객에게 정보를 받기(amount)
        long amount = -1100L;

        // 4. 이체(ssar -> cos 1000원)
        BankService.이체(ssarAccount, cosAccount, amount);
        System.out.println(ssarAccount);
        System.out.println(cosAccount);
        // 5. 이체(ssar -> love 1000원)
        BankService.이체(ssarAccount, loveAccount, amount);
        System.out.println(ssarAccount);
        System.out.println(loveAccount);
        BankService.출금(ssarAccount, amount);
        System.out.println(ssarAccount);
    }
}
