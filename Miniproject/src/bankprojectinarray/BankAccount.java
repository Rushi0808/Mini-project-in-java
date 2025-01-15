package bankprojectinarray;

public class BankAccount {
	int accno;
	String name;
	double balence;
	String acctype;

	public BankAccount(int accno, String name, double balence, String acctype) {

		this.accno = accno;
		this.name = name;
		this.balence = balence;
		this.acctype = acctype;
	}

	public void deposite(double ammount) {
		if (ammount > 0) {
			balence = balence + ammount;
			System.out.println(ammount + "credited your account" + accno + "sussesfully!!!");
			System.out.println("after deposite your current balence is " + balence);

		} else
			System.out.println("negitive ammount can not be deposited");

	}

	public void withdrow(double ammount) {
		if (ammount < balence) {
			balence = balence - ammount;
			System.out.println(ammount + "withdrow from  your account" + accno + "sussesfully!!!");

		} else
			System.out.println("insufficient balence !!!");

	}

	public void cheakbalence() {
		System.out.println("your current balence is :" + balence);
	}

	public int accno() {
		return accno;
	}

}
