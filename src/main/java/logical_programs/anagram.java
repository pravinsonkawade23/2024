package logical_programs;

import java.util.Arrays;

public class anagram 
{
	public static void main(String[] args) 
	{
		String a = "listen";
		String b = "silent";
		System.out.println(isAnagram(a, b));
	}
	
	public static boolean isAnagram(String one, String two)
	{
		if(one.length() != two.length())
		{
			return false;
		}
		
		char[] fst = one.toCharArray();
		Arrays.sort(fst);
		
		char[] sec = two.toCharArray();
		Arrays.sort(sec);
		
		for(int i=0; i<fst.length; i++)
		{
			if(fst[i] != sec[i])
			{
				return false;
			}
		}
		
		return true;
	}

}
