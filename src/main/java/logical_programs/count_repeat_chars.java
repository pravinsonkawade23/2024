package logical_programs;

public class count_repeat_chars 
{
	public static void main(String[] args) 
	{
		//countDupChars("aabbbcccccddeeffggggg");
	}
	
	public static void getOcurring(String str)
	{
		int count[] = new int[256];
		int len = str.length();
		
		for(int i=0; i<len; i++)
		count[str.charAt(i)]++;
		
		
		
	}
		
	

}
