package logical_programs;

public class evenAndOddDigitCountInNumber 
{
	public static void main(String[] args) 
	{
		int a = 1146347796;
		int len = String.valueOf(a).length();
		int evenNo = 0;
		int oddNo = 0;
		
		System.out.println("The given integer is: "+a);
		System.out.println("The length of given integer is: "+len);
		while(a>0)
		{
			int digit = 0;
			digit = a % 10;
			a = a/10;
			
			if(digit == 0)
			{
				continue;
			}
			
			else if(digit%2==0)
			{
				evenNo++;
			}
			
			else
			{
				oddNo++; 
			}
						
		}
		System.out.println("the count of even digits are : "+evenNo);
		System.out.println("the count of odd digits are :"+oddNo);
			
	}

}
