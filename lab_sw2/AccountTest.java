public class AccountTest {
	public static void main (String[] args) {

		Account myAccount = new Account("1234", 10000.0); // Set account to active state
        myAccount.activate(); // Displays "Account is already activated!"

        // Suspend the account
		myAccount.suspend(); // Displays "Account is suspended!"

		// Activate the account
        myAccount.activate(); // Displays "Account is activated!"
		
		// Deposit to the account
	    myAccount.deposit(1000.0); // Update balance and displays account number and
        // Current balance. Call the toString() method in deposit().    	                                

        // Withdraw to the account
	    myAccount.withdraw(100.0); // Update balance and displays account number and
        // Current balance. Call the toString() method in withdraw().    	                                

		// Close the account()
		myAccount.close(); // Displays "Account is closed!"

		// Activate the account
		myAccount.activate(); // Displays "You cannot activate a closed account!"	

		// Suspend the account
		myAccount.suspend(); // Displays " You cannot suspend a closed account!"

		// Withdraw to the account
        myAccount.withdraw(500.0);
        // Show message "You cannot withdraw on a closed account!". Call the toString() to show current balance and account number.

		// Deposit to the account
        myAccount.deposit(1000.0);
        // Show message "You cannot deposit on closed account!". Call the toString() to show current balance and account number.
    }
}