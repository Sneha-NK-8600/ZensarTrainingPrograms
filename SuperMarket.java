package JavaDSA;

import java.util.*;

public class SuperMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a code of product : ");
		int code=sc.nextInt();
		
		int digit=1;
		
		while(code>0)
		{
			int temp=code%10;
			digit=digit*temp;
			code=code/10;
	
		}
		System.out.print("Price of product is : "+digit);
	}

}
