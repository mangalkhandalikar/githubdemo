/* 34. Create and use copy constructor for above problem. */

import java.util.Scanner;

public class Ass34Copy {
	
	final int age=18;
	String name;
	
	Ass34Copy(String name)
	{
		this.name = name;
	}
	
	Ass34Copy(Ass34Copy a)
	{
		this.name = a.name;
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
		
		Ass34Copy p = new Ass34Copy(n);
		p.display();
		
		Ass34Copy p1 = new Ass34Copy(p);
		p1.display();
	}

}
