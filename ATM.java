/* 
 
 --Classes--
 
 A) ATM(Main class)
 B) OptionMenu
 C) Account
 
 --Methods/Functions--
 
 A) ATM (MAin class)
   1) main method
   
 B) OptionMenu
   2) getLogin()
   3) getAccountType()
   4) getCurrent()
   5) getSaving()
   
 C) Account
   6) setCustomerName()
   7) setPinNumber()
   8) getCustomerNumber()
   9) getPinNumber()
  10) getCurrentBalance()
  11) getSavingBalance()
  12) getCurrentWithdrawInput()
  13) getSavingWithdrawInput()
  14) getCurrentDeposit()
  15) getSavingDeposit()
  16) calcCurrentWithdraw()
  17) calcSavingWithdraw()
  18) calcCurrentDeposit()
  19) calcSavingDeposit()
 
 */

package ATM;
import java.util.*;
import java.text.*;

class Account
{
	double CB=2000;
	double SB=1000;
	
	private int CN;
	private int PN;
	
	Scanner sc=new Scanner(System.in);
   
	DecimalFormat df1=new DecimalFormat("#,##0.0 'Rupee'");
	DecimalFormat df2=new DecimalFormat("#,##0.0 'Rupee'");
	
	
	void setCustomerName(int cn)
	{
		this.CN=cn;
		
	}
	
	void setPinNumber(int pn)
	{
		this.PN=pn;
		
	}
	
	int getCustomerNumber()
	{
		return CN;
	}
	
	int getPinNumber()
	{
		return PN;
	}
	
	void getCurrentBalance()
	{
		System.out.println("\nYour Current Balance is : "+df1.format(CB));
	}
	void getSavingBalance()
	{
		System.out.println("\nYour Saving Balance is : "+df2.format(SB));
	}
	
	void getCurrentWithdrawInput()
	{
		System.out.println("\nYour Current Balance is : "+df1.format(CB));
		System.out.print("Enter Withdraw Amount : ");
		double currentamount=sc.nextInt();
		
		if(CB-currentamount>=0)
		{
			System.out.println("\nTransaction Successsful...!!!");
			double newAmount=calcCurrentWithdraw(currentamount);
			System.out.println("\nYour New Current Balance is : "+newAmount);
		}
		else 
		{
			System.err.println("\nInsufficient Balance...");
		}
	}
	
	
	void getSavingWithdrawInpt()
	{
		System.out.println("\nYour Saving Balance is : "+df2.format(SB));
		System.out.print("Enter Withdraw Amount : ");
		double savingamount=sc.nextInt();
		
		if(SB-savingamount>=0)
		{
			System.out.println("\nTransaction Successsful...!!!");
			double newAmount=calcSavingWithdraw(savingamount);
			System.out.println("\nYour New Saving Account Current Balance is : "+newAmount);
		}
		else 
		{
			System.err.println("\nInsufficient Balance...");
		}
    }
	
	void getSavingDeposit()
	{
		System.out.println("\nYour Saving Balance is : "+df2.format(SB));
		System.out.print("Enter Deposit Amount : ");
		double depositamount=sc.nextInt();
		
		if(SB>=0)
		{
			System.out.println("\nAmount Deposited Successsful...!!!");
			double newAmount=calcSavingDeposit(depositamount);
			System.out.println("\nYour New Saving Account Current Balance is : "+newAmount);
		}
		
	}
	
	void getCurrentDeposit()
	{
		System.out.println("\nYour Current Balance is : "+df1.format(CB));
		System.out.print("Enter Deposit Amount : ");
		double depositamount=sc.nextInt();
		
		if(CB>=0)
		{
			System.out.println("\nAmount Deposited Successsful...!!!");
			double newAmount=calcCurrentDeposit(depositamount);
			System.out.println("\nYour New Saving Account Current Balance is : "+newAmount);
		}
	}
	double calcCurrentWithdraw(double amt)
	{
		 CB=CB-amt;
		 return CB;
	}
	
	double calcSavingWithdraw(double amt)
	{
		 SB=SB-amt;
		 return SB;
	}
	
	double calcCurrentDeposit(double amt) 
	{
		CB=CB+amt;
		return CB;
	}
	
	double calcSavingDeposit(double amt) 
	{
		SB=SB+amt;
		return SB;
	}
}

class OptionMenu extends Account
{
	Scanner sc=new Scanner(System.in);
	HashMap <Integer,Integer> hm = new HashMap();
	
	public void getLogin()
	{
		int i=2;
		do
		{
			try 
			{
				hm.put(11111,111);
				hm.put(11112,222);
				hm.put(11113,333);
				hm.put(11114,444);
				hm.put(11115,111);
				
				System.out.println("\nWELCOME TO ATM...!!!");
				System.out.print("\nEnter Customer Number :");
				setCustomerName(sc.nextInt());
				System.out.print("\nEnter PIN Number :");
				setPinNumber(sc.nextInt());
				
				int P=getCustomerNumber();
				int Q=getPinNumber();
				
				      if(hm.containsKey(P) && hm.get(P)==Q)
				       {
					         getAccountType();
				       }
				      else
				       {
					        System.err.println("\nWrong Customer Number or PIN Number");
					        System.out.println("Please Enter Valid Customer Number or PIN Number");
				       }
			}
				catch(Exception e)
				{
					System.err.println("\nEnter only Numbers");
					System.out.println("Characters and Symbols are not allowed");
				}
		}while(i==2);
		
		}
	
	void getAccountType()
	{
		System.out.println("\nEnter Account Type :");
		System.out.println("\nChoice 1 : Current Account");
		System.out.println("Choice 2 : Saving Account");
		System.out.println("Choice 3 : Exit");
		System.out.print("Choice : ");
		
		int ch=sc.nextInt();
		 
		switch(ch)
		{
		case 1: getCurrent();
		        break;
		case 2: getSaving();
                break;
		case 3: System.out.println("\nTHANK YOU FOR VISITING...!!!");
		         sc.nextLine();
                break;
		default: System.err.println("\nInvalid Choice");
		         System.out.println("Please Enter Valid Choice");
		         getAccountType();  //recursion
			     break;
		}
	}
	
	void getCurrent()
	{
		System.out.println("\nCurrent Account");
		System.out.println("\nChoice 1 : Balance Enquiry");
		System.out.println("Choice 2 : Withdraw Money");
		System.out.println("Choice 3 : Deposit Money");
		System.out.println("Choice 4 : Exit");
		System.out.print("Choice : ");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:getCurrentBalance();
		        break;
		case 2: getCurrentWithdrawInput();
			break;
		case 3: getCurrentDeposit();
			break;
		case 4: System.out.println("\nTHANK YOU FOR VISITING...!!!");
		        System.out.println("VISIT AGAIN...!!!");
		        break;
		default: System.err.println("\nInvalid Choice");
		         System.out.println("Please Enter Valid Choice");
		          getCurrent();
		          break;
		}
		
		
		
	}
	
	void getSaving()
	{
		System.out.println("\nSaving Account");
		System.out.println("\nChoice 1 : Balance Enquiry");
		System.out.println("Choice 2 : Withdraw Money");
		System.out.println("Choice 3 : Deposit Money");
		System.out.println("Choice 4 : Exit");
		System.out.print("Choice : ");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1: getSavingBalance();
		        getAccountType();
		        break;
		case 2: getSavingWithdrawInpt();
		        getAccountType();
			break;
		case 3: getSavingDeposit();
			break;
		case 4: System.out.println("\nTHANK YOU FOR VISITING...!!!");
		        System.out.println("VISIT AGAIN...!!!");
		        break;
		default: System.err.println("\nInvalid Choice");
		         System.out.println("Please Enter Valid Choice");
		          getCurrent();
		          break;
		}
		
	}
}

	
public class ATM {
	public static void main(String args[])
	{
	OptionMenu op=new OptionMenu();
	op.getLogin();
	}
}
