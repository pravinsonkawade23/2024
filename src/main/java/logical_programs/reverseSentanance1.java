package logical_programs;

public class reverseSentanance1 
{
	public static void main(String[] args) 
	{
		String input = "I am Pravin";
		String a[] = input.split(" ");
		String ans = " ";
		
		for(int i=a.length-1; i>=0; i--)
		{
			ans = ans + a[i] + " ";
		}
		System.out.println("Reversed sentance is: "+ans);
		
		
	}

}
