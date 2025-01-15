package BankException;

public class NegativeAccountNumberException extends Exception {

	
	public NegativeAccountNumberException() {
		super();
	}
	public NegativeAccountNumberException(String msg) {
		super(msg);

}
}