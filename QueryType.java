package JavaDSA;

import java.util.*;
public class QueryType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter Size of an Array : ");
		int n=sc.nextInt();
		
		System.out.println();
		
		int Arr[]=new int[n];
				
		System.out.println("Enter Array Elements : ");
		System.out.println();
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter "+(i+1)+" Element: ");
			Arr[i]=sc.nextInt();
		}
		
		System.out.println();
		
		System.out.print("Enter total number of queries : ");
		int query=sc.nextInt();
		int TotalSum=0;
		
		System.out.println();
		
		for(int j=1;j<=query;j++)
		{
			System.out.print("Enter type "+j+" query : ");
			int type=sc.nextInt();
			System.out.print("Enter Starting index of an Array : ");
			int L=sc.nextInt();
			System.out.print("Enter Ending index of an Array : ");
			int r=sc.nextInt();
			
			System.out.println();
			
			if(type==1)
			{
				for(int k=L;k<=r;k++)
				{
			        Arr[k] =	(k-L+1)*Arr[L];
				}
			}
			else if(type==2)
			{
				
				for(int m=L;m<=r;m++)
				{
					TotalSum=TotalSum+Arr[m];
				}	
			}
			
		}
		
		System.out.println();
		System.out.println("Total sum of Type 2 Query is : "+TotalSum);			

	}

}
