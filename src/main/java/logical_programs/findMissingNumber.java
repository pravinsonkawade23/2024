package logical_programs;

public class findMissingNumber 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,6,7,8,9};
		int n = a.length;
		
		System.out.print("The given series of number:");
		for (int j=0; j<=n-1; j++)
		{
			System.out.print(a[j]+" ");
		}
		System.out.println();
		System.out.println("The missing number:"+getMissingNo(a,n));		
	}
	
	public static int getMissingNo(int a[], int n)
	{
		int sum = ((n+1)*(n+2))/2;
		for(int i=0; i<n; i++)
		{
			sum = sum - a[i];
		}
		return sum;
	}

}
