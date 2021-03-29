package sec07_user_define_exception;

public class Account {

	private long balance;
	
	public long getBalance() {
		return balance;
		
	}
	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			// throw는 예외를 강제로 발생시킨다.
			throw new BalanceInsufficientException("잔고부족: "+(money-balance));
		}
		balance -= money;
	}
	
}
