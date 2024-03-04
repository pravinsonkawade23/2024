package logical_programs;

public class printPrimeNumber 
{
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int n = 100;
		String primeNum = "";
		
		for(i=1; i<n; i++)
		{
			int count = 0;
			for( j=i; j>=1; j--)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				primeNum = primeNum + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100: ");
		System.out.println(primeNum);
	}

}
