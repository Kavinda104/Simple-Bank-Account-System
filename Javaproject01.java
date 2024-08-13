//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//
//**************                     ******************************************//
//@@@@@@@@@@@@@@    MGT/6125      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@//
//##############    MGT.2020.104      #########################################//
//@@@@@@@@@@@@@@    I.M.K.G. Edirisooriya      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@//
//**************    Final Java Project- Bank Account System     ***************//
//$$$$$$$$$$$$$$    Department of Information Systems      $$$$$$$$$$$$$$$$$$$$//
//@@@@@@@@@@@@@@    Faculty of Management Studies       @@@@@@@@@@@@@@@@@@@@@@@//
//%%%%%%%%%%%%%%    Rajarata University of Sri Lanka...    %%%%%%%%%%%%%%%%%%%%//
//**************                                        ***********************//
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//



import java.util.Scanner;

class Javaproject01
{
	public static void main(String[]args)
	{
		BankAccount obj = new BankAccount("Kavinda ", "MGT00104");
		obj.showMenu();
	}
}
class BankAccount
{
	int balance;
	int previousTransaction;
	String accountHolderName;
	String accountID;
	
	BankAccount(String aname, String aid)
		{
			accountHolderName = aname;
			accountID = aid;
		}
	
	void deposit(int amount)
	{
		if(amount != 0)
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	void getPreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposited; " + previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("withdraw; " +Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No Transaction Occured");
		}
	}
	void showMenu()
	{
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " +accountHolderName);
		System.out.println("Your ID " +accountID);
		System.out.println("\n");
		
		System.out.println("A : Check Your Balance");
		System.out.println("B : Deposit");
		System.out.println("C : Withdraw");
		System.out.println("D : Previous Transaction");
		System.out.println("E : Exit The System");
		
		do
		{
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.println("Enter Your Option");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch (option)
			{
				case 'A':
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Balance = "+balance);
					System.out.println("-----------------------------------------------------------------");
					System.out.println("\n");
					break;
					
				case 'B':
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Enter an amount to deposit ");
					System.out.println("-----------------------------------------------------------------");
					
					int amount = scanner.nextInt();
					deposit(amount);
					System.out.println("\n");
					break;	
					
				case 'C':
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Enter an amount to withdraw ");
					System.out.println("-----------------------------------------------------------------");
					
					int amount2 = scanner.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;
				
				case 'D':
					System.out.println("-----------------------------------------------------------------");
					getPreviousTransaction();
					System.out.println("-----------------------------------------------------------------");
					System.out.println("\n");
					break;
					
				case 'E':
					System.out.println("========================================================================");
					break;
					
				default:
					System.out.println("Invalid Option!! Please Enter Correct Option...");
					break;
			}
			
		}
		while(option != 'E');
		System.out.println("Thank You for Using our Service...!!");
	}
	
	/* About this program = This program can be used as a Bank transaction system. Do you want to check balance, Enter "A",
							 If you want to deposit money, you should press "B" and type your deposit money balance, If you
							 want to withdraw money, press "C" and type your own withdrawal,If you want to see your previous 
							 transaction, press "D" and lastly you can exit from the system by using "E"...*/
	
	/* I specially thanks for our lecturer Mr.Udesh S. Senarath for teaching us "Computer Programming subject" and thanks 
	    to everyone who helped me for make this program as well.... Thank you !!! */
	
}