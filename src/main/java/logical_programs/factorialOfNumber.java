package logical_programs;

public class factorialOfNumber 
{
	public static void main(String[] args) 
	{
		int a = 9;
		System.out.println("The given number is:"+a);
		if(a>0)
		{
			factorial(a);
		}
		else
		{
			System.out.println("Please enter the +ve integer!!!!!!");
		}	
	}
	
	public static void factorial(int number)
	{
		int num = number;
		long factorial = 1;
		
		while(num >0)
		{
			factorial = factorial * num;
			num--;
		}
		System.out.println("The factorial of "+number+ " is:"+factorial);		
	}

}
