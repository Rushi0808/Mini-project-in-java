package bankprojectinarray;

import java.util.Scanner;

import BankException.DuplicateAccountNumberException;
import BankException.InvalidAccountNumberException;
import BankException.NegativeAccountNumberException;
import BankException.insufficientBalanceException;
import BankException.invalidAccountType;
import BankException.negetiveAmmountException;

public class testbank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount[] bank = new BankAccount[10];
		int index = 0;

		bank[index++] = new BankAccount(11, "jay", 1000, "saving");
		bank[index++] = new BankAccount(12, "rushi", 5000, "saving");
		bank[index++] = new BankAccount(13, "om", 2000, "current");

		while (true) {
			System.out.println("\t **** welcome to skills it academy bank ****");
			System.out.println("\t 1: add new account \n" + "\t 2: display all account \n"
					+ "\t 3: serch account by account number \n" + "\t 4: deposit \n" + "\t 5: withdrow \n "
					+ "\t 6: exit");

			System.out.println("----------------------------------------------------------------------------------");

			System.out.println("enter your choice ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("enter account no ");
				int accno = sc.nextInt();
				boolean found = false;
				for (BankAccount account : bank) {
					if (account != null) {

						try {
							if (account.accno() == accno) {
								found = true;
								throw new DuplicateAccountNumberException();
							}

							for (BankAccount account1 : bank)
								if (account1 != null && accno < 0) {
									found = true;
									throw new NegativeAccountNumberException(
											accno + " :negative Account number invalid");

								}

							if (!found) {
								System.out.println(
										"enter addistional deatils such as name balence,acctype(seving/Current) ");
								String name = sc.next();
								double balence = sc.nextDouble();
								String acctype = sc.next();
								if (acctype.equalsIgnoreCase("current") || acctype.equalsIgnoreCase("seving")) {

									bank[index++] = new BankAccount(accno, name, balence, acctype);

									System.out.println("account created succsesfully !!!");

								} else {
									throw new invalidAccountType();
								}

							}
						}

						catch (DuplicateAccountNumberException e) {
							e.printStackTrace();
						} catch (NegativeAccountNumberException e) {
							e.printStackTrace();
							break;
						} catch (invalidAccountType e) {
							e.printStackTrace();
							break;
						}

					}
				}

			} else if (choice == 2) {
				for (BankAccount account : bank) {
					if (account != null) {
						System.out.println("account holder number :" + account.accno);
						System.out.println("account holder name :" + account.name);
						System.out.println("account holder balence :" + account.balence);
						System.out.println("account holder acctype :" + account.acctype);
						System.out.println("-------------------------------------------------------------------");
					}
				}

			} else if (choice == 3) {
				System.out.println("enter account number to serch account :");
				int accno = sc.nextInt();
				// boolean found = false;
				for (BankAccount account : bank) {

					try {
						if (account != null) {
							if (account.accno == accno) {
								System.out.println("account holder number :" + account.accno);
								System.out.println("account holder name :" + account.name);
								System.out.println("account holder balence :" + account.balence);
								System.out.println("account holder acctype :" + account.acctype);
								System.out.println("-------------------------------------------------------------------");
								break;

							} else if (account.accno != accno) {
								throw new InvalidAccountNumberException("Account number is not present !!!");
							}

						}

					} catch (InvalidAccountNumberException e) {
						e.printStackTrace();
						break;

					}

				}

			}

			else if (choice == 4)

			{
				System.out.println("enter account number :");
				int accno = sc.nextInt();
				System.out.println("enter ammount deposite");
				double ammount = sc.nextDouble();

				for (BankAccount account : bank) {
					if (account != null) {
						try {

							if (account != null) {
								if (account.balence < ammount) {
									account.deposite(ammount);
								} else {
									throw new negetiveAmmountException();
								}
							}
						} catch (negetiveAmmountException e) {
							e.printStackTrace();
							break;
						}
						System.out.println("negetive ammount is invalid");
					}
				}
			} else if (choice == 5) {

				System.out.println("enter account number  :");
				int accno = sc.nextInt();
				System.out.println("enter ammount withdrow");
				double ammount = sc.nextDouble();

				for (BankAccount account : bank) {
					if (account != null) {

						try {
							if (account != null) {
								if (account.accno == accno) {

								} else if (account.balence < ammount) {
									account.withdrow(ammount);
								} else {
									throw new insufficientBalanceException();
								}

							}

						} catch (insufficientBalanceException e) {
							e.printStackTrace();
							break;
						}
						System.out.println("ifsufficientBalence ");
					}

				}
			} else if (choice == 6) {

				System.out.println("thanks for using our bank application");
				break;

			}
		}

	}
}
