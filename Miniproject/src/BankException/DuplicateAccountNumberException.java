package BankException;

public class DuplicateAccountNumberException extends Exception  {

	
	public DuplicateAccountNumberException() {
		super();
	}
	public DuplicateAccountNumberException(String msg) {
		super(msg);

}
}