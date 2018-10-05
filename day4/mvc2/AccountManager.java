package day4.mvc2;

public class AccountManager {
    public static void main(String[] args)
    { // create the application's objects:
        BankReader reader = new BankReader();
        BankAccount primary_account = new BankAccount(0);
        BankWriter primary_writer =
                new BankWriter("계좌#1", primary_account);
        BankAccount secondary_account = new BankAccount(0);
        BankWriter secondary_writer =
                new BankWriter("계좌#2", secondary_account);
        AccountController controller =
                new AccountController(reader, primary_account, primary_writer,
                        secondary_account, secondary_writer);
        controller.processTransactions();
    }
}
