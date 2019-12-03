import java.util.Scanner;

/*52.Store name of weekdays in an array (starting from “Sunday” at 0 index). 
 * Ask day position from user and print day name. 
 * Handle array index out of bound exception and give proper message 
 * if user enter day index outside range (0-6).*/

public class Ass52ArrayOutOfBounds 
{
	public static void main(String[] args) 
	{
		String week[] = new String[] {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter number(0 to 6): ");
			int num = sc.nextInt();
			
			System.out.println(week[num]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
