package logical_programs;

public class lowestNumFromArray 
{
	public static void main(String[] args) 
	{
		int a[]= {23,83,87,13,45,89,25};
		int n = a.length;
		
		for(int k=0; k<n-1; k++)
		{
			System.out.print(a[k ]);
		}
		System.out.println("smallest number:"+getLowestNumber(a, n));
	}
	
	public static int getLowestNumber(int a[], int total)
	{
		int temp = 0;
		for(int i=0; i<total; i++)
		{
			for(int j=i+1; j<total; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a[0];
	}

}
