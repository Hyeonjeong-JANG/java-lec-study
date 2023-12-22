package ex04.bankAppEx;

import ex04.bankAppEx.model.Account;

public class BankService {

    public static void 출금(Account withdrawalAccount, long amount) {
        if (amount <= 0) {
            System.out.println("이체 금액을 확인해 주세요. 0원 이하는 이체할 수 없습니다.");
            return;
        }

        if (withdrawalAccount.잔액부족하니(amount)) {
            System.out.println("잔액부족");
            return;
        }
        withdrawalAccount.출금(amount);
    }

    public static void 이체(Account withdrawalAccount, Account depositAccount, long amount
    ) {
        if (amount <= 0) {
            System.out.println("이체 금액을 확인해 주세요. 0원 이하는 이체할 수 없습니다.");
            return;
        }
        if (withdrawalAccount.잔액부족하니(amount)) {
            System.out.println("잔액이 부족합니다. 이체 금액을 다시 입력해 주세요.");
            return;
        }
        withdrawalAccount.출금(amount);
        depositAccount.입금(amount);
    }

}
