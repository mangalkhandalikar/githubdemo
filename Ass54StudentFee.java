import java.util.Scanner;

/*
 * 54.Create Interface StudentFee and declare following method.  
	getFee() throws InvalidFeeException. This method ask fees from user and 
	throws exception if user enters invalid or negative fees
	Create class Student with members (name, fees) and implement 
	the StudentFee Interface.
*/

public class Ass54StudentFee 
{
	public static void main(String[] args) throws InvalidFeeException 
	{
		Student1 s = new Student1();
		s.getFee();
	}
}

interface StudentFee
{
	void getFee() throws InvalidFeeException;
}

class Student1 implements StudentFee
{
	String name;
	int fee;
	
	Scanner sc = new Scanner(System.in);
	
	public void getFee() throws InvalidFeeException
	{
//		System.out.println("Enter name: ");
//		name = sc.next();
		
		System.out.println("Enter fee : ");
		fee = sc.nextInt();
		
		if(fee<0 || fee<10000)
		{
			new InvalidFeeException();
		}
		else
		{
			System.out.println("Fee received...");
		}
	}
}

@SuppressWarnings("serial")
class InvalidFeeException extends Exception
{
	InvalidFeeException()
	{
		System.out.println("Invalid fee...");
	}
}
