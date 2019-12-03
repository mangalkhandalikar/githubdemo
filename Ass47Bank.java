import java.util.Scanner;

/*
47.Create a program that helps banks to maintain records. It should have 
following facilities.
	o	Anybody can create current or saving account with following initial 
		information: account number, name, balance, and branch.
	o	display account detail for a particular accounts.
	o	display total money deposited in bank.
	o	allow deposit and  withdrawal in an account  .
	o	for saving account opening balance and minimum balance must be 5000.
	o	for current account opening balance and minimum balance must be 1000.
	o	can not withdraw the amount from the account that makes balance 
		less than the minimum balance.
*/

public class Ass47Bank 
{
	public static void main(String[] args) 
	{
		int ch;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		
		while(true)
		{
			System.out.println("1. Saving \n2. Current \n3. Exit");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("*********** Saving Account ***********");
					System.out.println("Minimum balance for saving account is 5000");
					System.out.println("1. Accept \n2. Display \n3. Deposite \n4. Withdraw \n5. Total balance \n6. Exit");
					System.out.println("Enter your choice");
					ch = sc.nextInt();
						
					switch(ch)
					{
						case 1:
							b.accept();
						break;
							
						case 2:
							b.display();
						break;
							
						case 3:
							b.deposite(5000);
						break;
							
						case 4:
							b.withdraw(5000);
						break;
							
						case 5:
							b.totalBalance();
						break;
							
						case 6:
							System.exit(0);
								
						default:
							System.out.println("Enter Correct Choice..");
					}
				break;
				
				case 2:
					System.out.println("*********** Current Account ***********");
					System.out.println("Minimum balance for current account is 1000");
					System.out.println("1. Accept \n2. Display \n3. Deposite \n4. Withdraw \n5. Total balance \n6. Exit");
					System.out.println("Enter your choice");
					ch = sc.nextInt();
						
					switch(ch)
					{
						case 1:
							b.accept();
						break;
							
						case 2:
							b.display();
						break;
							
						case 3:
							b.deposite(1000);	
						break;
				
						case 4:
							b.withdraw(1000);
						break;
							
						case 5:
							b.totalBalance();
						break;
							
						case 6:
							System.exit(0);
								
						default:
							System.out.println("Enter Correct Choice..");
					}
				break;	
			}
		}
	}
}

class Bank
{
	int acc_no;
	String name, branch;
	float balance;
	
	Scanner sc =new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter account number: ");
		acc_no = sc.nextInt();
		
		System.out.println("Enter account holder name: ");
		name = sc.next();
		
		System.out.println("Enter branch: ");
		branch = sc.next();
	}
	
	void display()
	{
		System.out.println("Account number: "+acc_no);
		System.out.println("Account holder name: "+name);
		System.out.println("Balance: "+balance);
		System.out.println("Branch: "+branch);
	}
	
	void totalBalance()
	{
		System.out.println("Total balance = "+balance);
	}
	
	void deposite(float amtd)
	{
		System.out.println("Enter amount to deposite: ");
		float amt = sc.nextFloat();
		
		if(balance >= amtd)
			balance = balance + amt;
		else if(amt >= amtd)
			balance = balance + amt;
		else
			System.out.println("Minimum balance should be maintained..");
	}
	
	void withdraw(float amtw)
	{
		System.out.println("Enter amount to withdraw: ");
		float amt = sc.nextFloat();
		
		if(balance > amtw)
		{
			balance = balance - amt;
			
			if(balance < amtw)
			{
				System.out.println("Minimum balance should be maintained..");
			}
		}
		else
		{
			System.out.println("Balance is low..");
		}
	}
}
