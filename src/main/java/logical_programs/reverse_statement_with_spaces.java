package logical_programs;

public class reverse_statement_with_spaces 
{
	public static void main(String[] args) 
	{
		String a ="I am Pravin";
		char [] inputArr = a.toCharArray();
		char [] result = new char[inputArr.length];
		
		for(int i=0; i<inputArr.length; i++)
		{
			if(inputArr[i] ==' ')
			{
				result[i] = ' ';
			}
			else
			{
				continue;
			}
		}
		
		int j=result.length-1;
		for(int i=0; i<inputArr.length; i++)
		{
			if(inputArr[i]!=' ')
			{
				if(result[j]==' ')
				{
					j--;
				}
				result[j] = inputArr[i];
				j--;
			}
		}
		System.out.println(result);
	}

}
