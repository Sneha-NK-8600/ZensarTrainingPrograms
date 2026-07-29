package JavaDSA;

import java.util.*;

public class SingleDigitSum {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);	
	
	System.out.print("Enter first number : ");
	int n1=sc.nextInt();
	
	System.out.print("\nEnter secong number : ");
	int n2=sc.nextInt();
	
	
	int sum=0;
	
	while(n1>0 && n1==n2)
	{
		
		int temp=n1%10;
	    sum=sum+temp;
		n1=n1/10;
   }
	
	System.out.println("Sum of single digit is : "+sum);
 }
	

}
