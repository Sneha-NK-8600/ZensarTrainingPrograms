package JavaDSA;

import java.util.*;

public class PriorElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Array Size : ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		
		int count=1;
		int maxelement=arr[0];
		
		
		System.out.println("\nEnter Array Elements : ");
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter "+(i+1)+" Element : ");
			arr[i]=sc.nextInt();
		}
		
		for(int i=1;i<n;i++)
		{
			if(arr[i]>maxelement)
			{
				maxelement=arr[i];
				count++;
			}
		}
		
		System.out.println("\nCount is : "+count);
		
	}
	

}
