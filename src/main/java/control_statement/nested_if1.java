package control_statement;

public class nested_if1 
{
	public static void main(String[] args) 
	{
		//declaring variables
		String un = "pravin";
		String pwd = "ppp";
		
		if("pravin"==un)
		{
			System.out.println("correct username");
			if("pp"==pwd)
			{
				System.out.println("login successfull");
			}
			else
			{
				System.out.println("wrong password >>> login fail!!!!!");
			}
		}
		else
		{
			System.out.println("wrong password >>> login fail");
		}
		
	}

}
