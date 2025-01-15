package BankException;

public class InvalidAccountNumberException extends Exception {

	public InvalidAccountNumberException() {
		super();
	}
	public InvalidAccountNumberException(String msg) {
		super(msg);

}
}