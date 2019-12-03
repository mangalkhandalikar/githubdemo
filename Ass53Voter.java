import java.util.Scanner;

/*Create a class Voter(voterId, name, age) with parameterized constructor.  
 * The parameterized constructor should throw a checked exception if 
 * age is less than 18. 
 * The message of exception is “invalid age for voter ”
*/

public class Ass53Voter 
{
	int age;
	String name, voterId;
	
	
	public Ass53Voter(int age, String name, String voterId) throws MyException
	{
		this.age = age;
		this.name = name;
		this.voterId = voterId;
		
		if(age<18)
		{
			new MyException();
		}
		else
		{
			System.out.println("You can vote..");
		}
	}

	
	public static void main(String[] args) throws MyException 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr Voter ID: ");
		String id = sc.next();
		
		System.out.println("Enter name: ");
		String name = sc.next();
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		new Ass53Voter(age, name, id);
	}
}

@SuppressWarnings("serial")
class MyException extends Exception
{
	MyException()
	{
		System.out.println("Invalid age.. You can not vote..");
	}
}
