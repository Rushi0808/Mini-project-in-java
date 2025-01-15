package BankException;

public class invalidAccountType extends Exception{

	
	public invalidAccountType() {
		super();
	}
	public invalidAccountType(String msg) {
		super(msg);
	}
}
