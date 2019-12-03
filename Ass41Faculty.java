import java.util.Scanner;

/*
41.	Create three classes 
	Faculty (facultyid, salary)
	FullTimeFaculty (basic, allowance) inherits class Faculty
	PartTimeFaculty (hour, rate) inherits class Faculty

Create a method for accepting input in FullTimeFaculty and PartTimeFaculty,  
but salary should not be accepted. Salary is calculated on the basis of  
(basic+allowance) for FullTimeFaculty and (hour*rate) for PartTimeFaculty. 
Also create method in above classes to display faculty data.

Create another class(say XYZ) for main method and store 2 fulltime and 
2 parttime faculty information. Also print their details.
*/

public class Ass41Faculty 
{
	public static void main(String[] args) 
	{
		FullTimeFaculty full[] = new FullTimeFaculty[2];
		
		for(int i=0; i<2; i++)
		{
			full[i] = new FullTimeFaculty();
			full[i].accept();
		}
		
		for(int i=0; i<2; i++)
		{
			full[i].display();
		}
		
		PartTimeFaculty part[] = new PartTimeFaculty[2];
		
		for(int i=0; i<2; i++)
		{
			part[i] = new PartTimeFaculty();
			part[i].accept();
		}
		
		for(int i=0; i<2; i++)
		{
			part[i].display();
		}
	}
}

class Faculty
{
	int facultyid;
	float salary=20000f;
}

class FullTimeFaculty extends Faculty
{
	float basic, allowance;
	
	Scanner sc = new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter faculty id: ");
		facultyid = sc.nextInt();
		
		System.out.println("Enter basic: ");
		basic = sc.nextFloat();
		
		System.out.println("Enter allowance: ");
		allowance = sc.nextFloat();
	}
	
	void display()
	{
		System.out.println("Basic: "+basic);
		System.out.println("Allowance: "+allowance);
		System.out.println("Salary: "+(salary+basic+allowance));
	}
}

class PartTimeFaculty extends Faculty
{
	int hour;
	float rate;
	
	Scanner sc = new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter faculty id: ");
		facultyid = sc.nextInt();
		
		System.out.println("Enter hour: ");
		hour = sc.nextInt();
		
		System.out.println("Enter rate: ");
		rate = sc.nextFloat();
	}
	
	void display()
	{
		System.out.println("Hour: "+hour);
		System.out.println("Rate: "+rate);
		System.out.println("Salary: "+(hour*rate+salary));
	}
}