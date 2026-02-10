public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        // Default state is Active
        this.accountState = new ActiveState(); 
    }

    // Getters and Setters
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    // Delegated Methods
    public void deposit(Double amount) {
        accountState.deposit(amount, this);
    }

    public void withdraw(Double amount) {
        accountState.withdraw(amount, this);
    }

    public void activate() {
        accountState.activate(this);
    }

    public void suspend() {
        accountState.suspend(this);
    }

    public void close() {
        accountState.close(this);
    }

    @Override
    public String toString() {
        return "Account [" + accountNumber + "], Balance: " + balance;
    }
}