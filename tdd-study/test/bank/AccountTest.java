package bank;

// Test Class
class AccountTest {
    // 계좌 생성 테스트 케이스 (테스트 메서드)
    void testAccount() throws Exception {
        Account account = new Account();

        if (account == null) {
            throw new Exception("Fail account creation.");
        }
    }

    // 잔고 조회 테스트 케이스 (테스트 메서드)
    void testBalance() throws Exception {
        Account account = new Account();
        //...
    }

    public static void main(String[] args) {
        AccountTest accountTest = new AccountTest();
        try {
            accountTest.testAccount(); // 계좌 생성 테스트 케이스
            accountTest.testBalance(); // 잔고 조회 테스트 케이스
            // ... 그외의 테스트 케이스
        } catch (Exception e) {
            System.out.println("Test failed.");
        }
        System.out.println("Test passed.");
    }
}
