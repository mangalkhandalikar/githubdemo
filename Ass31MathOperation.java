/*31. Create a class MathOperation with two data member X and Y to store the operand and 
 * third data member R to store result of operation.
		Create method members
			init - to input X and Y from user
			add - to add X and Y and store in R
			multiply - to multiply X and Y and store in R
			power - to calculate X Y and store in R
			display- to display Result R*/

import java.util.Scanner;

public class Ass31MathOperation 
{
	double x,y,r=1;
	
	Scanner sc = new Scanner(System.in);
	
	void init()
	{
		System.out.println("Enter 2 numbers: ");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	void add()
	{
		r = x+y;
	}
	
	void multiply()
	{
		r = x*y;
	}
	
	void power()
	{
		/*r=1;
		for(int i=y; i>0; i--)
		{
			r *=x;
		}*/
		r = Math.pow(x,y);
	}
	
	void display()
	{
		System.out.println("Result: "+r);
		System.out.println("___________________________");
	}
	
	public static void main(String args[])
	{
		Ass31MathOperation mo = new Ass31MathOperation();
		
		System.out.println("Addition");
		mo.init();
		mo.add();
		mo.display();
		
		System.out.println("Multiplication");
		mo.init();
		mo.multiply();
		mo.display();
		
		System.out.println("Power");
		mo.init();
		mo.power();
		mo.display();
	}
}
