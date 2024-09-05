package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    @BeforeEach
    public void setup() {
        account = new Account(10000);
    }

    // 계좌 생성 테스트 케이스 (테스트 메서드)
    @Test
    void testAccount() throws Exception {
        // setup()
    }

    // 잔고 조회 테스트 케이스
    @Test
    void testGetBalance() throws Exception {
        assertEquals(10000, account.getBalance());

        account = new Account(3000);
        assertEquals(3000, account.getBalance());

        account = new Account(0);
        assertEquals(0, account.getBalance());
    }

    // 입금 테스트 케이스
    @Test
    void testDeposit() throws Exception {
        // when: setup()

        // given
        account.deposit(1000);

        // when
        assertEquals(11000, account.getBalance());
    }

    // 출금 테스트 케이스
    @Test
    void testWithdraw() throws Exception {
        // when: setup()

        // given
        account.withdraw(1000);

        // when
        assertEquals(9000, account.getBalance());
    }
}
