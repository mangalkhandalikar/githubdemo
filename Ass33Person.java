/*33. Create a class Person with properties (name and age) with following features.
		a.	Default  age of person should be 18;
		b.	A person object can be initialized with name and age;
		c.	Method to display name and age of person 
 */
import java.util.Scanner;

public class Ass33Person 
{
	final int age=18;
	String name;
	
	Ass33Person(String name)
	{
		this.name = name;
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String n = sc.next();
		
		Ass33Person p = new Ass33Person(n);
		p.display();
	}
}
