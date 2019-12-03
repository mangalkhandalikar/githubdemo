/*
44.Create an Abstract class Processor with int member variable data  
and method showData to display data value. 
Create abstract method process() to define processing of member data. 

	a.	Create a class  Factorial using abstract class Processor  to calculate 
	and print factorial of a number by overriding the process method.
	b.	Create a class  Circle using abstract class Processor  
	to calculate and print area of a circle by overriding the process method
	 Ask user to enter choice (factorial or circle area).  
	 Also ask data to work upon; Use Processor class reference to achieve this mechanism*/

import java.util.Scanner;
public class Ass44Abstract 
{
	public static void main(String[] args)
	{
		int ch;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Factorial \n2. Area \n3. Exit");
			System.out.println("Enter your choice: ");
			
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					Processor f = new Factorial();
					f.process();
				break;
				
				case 2:
					Processor c = new Circle();
					c.process();
				break;
				
				case 3:
					System.exit(0);
					
				default:
					System.out.println("Enter correct choice..");
				break;
			}
		}
	}
}

abstract class Processor
{
	int data;
	
	public void show()
	{
		System.out.println(data);
	}
	
	abstract void process();
	
}

class Factorial extends Processor
{	
	Scanner sc = new Scanner(System.in);

	void process() 
	{
		int n ,fact=1;
		System.out.println("Enter number to find factorial :");
		n= sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+n+" is "+fact);
		
	}
}

class Circle extends Processor
{
	Scanner sc = new Scanner(System.in);
	void process()
	{
		int r;
		float area;
		System.out.println("Enter radius to calculate area of circle :");
		r = sc.nextInt();
		
		area =(3.14f*r*r);
		
		System.out.println("Area of circle is "+area);
	}
}
