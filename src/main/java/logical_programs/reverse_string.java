package logical_programs;

public class reverse_string 
{
	public static void main(String[] args) 
	{
		String a = "pravin";
		String rev = "";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			rev = rev + a.charAt(i);
		}
		System.out.println("The original string = "+a);
		System.out.println("The reverse string = "+rev);
		//System.out.println(rev);
		
	}

}
