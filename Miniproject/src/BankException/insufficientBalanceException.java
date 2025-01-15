package BankException;

public class insufficientBalanceException extends Exception{

	
	public insufficientBalanceException() {
		super();
	}
	public insufficientBalanceException(String msg) {
		super(msg);
	}

}
