/*
mangal
digambar 
khandalikar
rollno
exit*/

/*30. Create a class to calculate Area of circle with one data member to store the radius and another to store area value.
	Create method members
  		1. init - to input radius from user
  		2. calc - to calculate area
  		3. display- to display area */

import java.util.Scanner;

public class Ass30AreaCircle 
{
	float radius, area;
	
	Scanner sc = new Scanner(System.in);
	
	Ass30AreaCircle()
	{
		radius = 0.0f;
	}
	
	void init()
	{
		System.out.println("Enter Radius: ");
		radius = sc.nextFloat();
	}
	
	void calc()
	{
		area = 3.14f*radius*radius;
	}
	
	void display()
	{
		System.out.println("Area of circle having radius "+radius+" is "+area);
	}
	
	public static void main(String args[]) 
	{
		Ass30AreaCircle ac = new Ass30AreaCircle();
		ac.init();
		ac.calc();
		ac.display();
	}
}
