package logical_programs;

public class duplicateCharsInString 
{
	public static void main(String[] args) 
	{
		String a = "vaishnavi";
		int count = 0;
		char[] b = a.toCharArray();
		
		for(int i=0; i<b.length; i++)
		{
			if(b[i] == 'i')
			{
				count++;
			}
		}
		System.out.println("'i' is repeated following times : "+count);
			
	}

}
