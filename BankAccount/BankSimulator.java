package BankAccount;

public class BankSimulator
{
	Account[] accs;

	public BankSimulator()
	{
		accs = new Account[10];

		accs[0] = new Account();
		accs[0].acc_no = 1;
		accs[0].acc_name = "สมชาย";
		accs[0].acc_password = "1234";
		accs[0].balance = 1000000;

		accs[1] = new Account();
		accs[1].acc_no = 2;
		accs[1].acc_name = "James Grossling";
		accs[1].acc_password = "1234";
		accs[1].balance = 1000000;

		accs[2] = new Account();
		accs[2].acc_no = 3;
		accs[2].acc_name = "Guido";
		accs[2].acc_password = "1234";
		accs[2].balance = 1000000;

	}

	private void printBalance(Account a)
	{
		if (a == null)
		{
			return;
		}
		System.out.println(a.acc_name + "have" + a.balance + "Baht");

	}

	private Account getAccountbyAccNo(int acc_no)
	{
		for (int i = 0; i < accs.length; i++)
		{
			if (accs == null)
				continue;
			if (accs[i].acc_no == acc_no)
			{
				return accs[i];
			}
		}
		return null;
	}

	public void deposit(int acc_no, double amount)
	{
		Account a = getAccountbyAccNo(acc_no);
		if (a == null)
		{
			System.out.println("Account not found!");
			return;
		}
		a.balance += amount;
		printBalance(a);
	}

	public void getBalance(int acc_no, String password)
	{
		Account a = getAccountbyAccNo(acc_no);
		if (a == null)
		{
			System.out.println("Account not found!");
			return;
		}
		if (a.acc_password.equals(password))
		{

		} else
		{
			System.out.println("Wrong password");
			return;
		}
		printBalance(a);
	}

	public void withdraw(int acc_no, String password, double amount)
	{
		Account a = getAccountbyAccNo(acc_no);
		if (a == null)
		{
			System.out.println("Account not found!");
			return;
		}
		if (a.acc_password.equals(password))
		{

		} else
		{
			System.out.println("Wrong password");
			return;
		}
		if (a.balance - amount < 0)
		{
			System.out.println("Insuffient amount to withdraw");
			return;
		}
		a.balance -= amount;
		printBalance(a);
	}
}
