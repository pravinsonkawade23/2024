package try11;

import java.util.Random;

public class randomDOB {

	public static void main(String[] args) 
	{
		System.out.println(generateRandomDOB().strip());
	}
	
	public static String generateRandomDOB()
	{
		Random random = new Random();
		int month = random.nextInt(12) + 1; //month
		int date = random.nextInt(28) + 1; //date
		int year = random.nextInt(2022 - 1930 + 1) + 1930;
		
		return String.format("%02d-%02d-%04d", month, date, year);
	}
}
