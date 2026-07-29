package JavaDSA;

public class PrimeNumber1 {

	static boolean isPrime(int num)
	{
		int c=2;
		while(c<num)
		{
			if(num%c==0)
			{
				return false;
			}
			c++;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		for(int i=2;i<=n;i++)
		{
			System.out.println(i +": "+ isPrime(i));
		}
	}

}

