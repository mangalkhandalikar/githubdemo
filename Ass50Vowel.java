import java.util.Scanner;

/*50.	Input name of a person and count how many vowels it contains. 
 * Use String class functions.*/

public class Ass50Vowel 
{
	public static void main(String[] args) 
	{
		String name;
		int count=0;
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		name = sc.next();
		
		for(int i=0; i<name.length(); i++)
		{
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
			{
				count++;
			}
		}
		
		System.out.println("Number of vowels in '"+name+"' are: "+count);
	}
}
