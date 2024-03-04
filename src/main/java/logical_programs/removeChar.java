package logical_programs;

public class removeChar 
{
	public static void main(String[] args) {
		String a = "pravin";
		char b = 'a';
		remove(a,b);
	}
	
	public static void remove(String st, char ch)
	{
		char [] c= st.toCharArray();
		char [] d= new char[c.length];
		int j=0;
		
		for(int i=0; i<st.length(); i++)
		{
			if(c[i]!= ch)
			{
				d[j]= c[i];
				j++;
			}
		}
		System.out.println(d);
		System.out.println(d.length);
	}
}
