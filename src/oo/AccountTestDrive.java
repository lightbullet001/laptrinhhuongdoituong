package oo;

public class AccountTestDrive{

    public static void main(String[] args) {
        Account account = new Account();

        account.show();
        account.deposite(500000);
        account.show();
        account.withdraw(100000);
        account.show();
    }
}