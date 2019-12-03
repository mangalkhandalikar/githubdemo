/*35. Create a class Employee  with(empNo ,salary and totalSalary) ) with following features.
		a.	Only parameterized constructor
		b.	totalSalary always represent total of all the salaries of all employees created.
		c.	empNo should be auto incremented. 
		d.	display total employees and totalSalary using class method.
*/

public class Ass35Employee 
{
	static int empNo;
	static int count;
	int cnt;
	static float totalSalary;
	static float salary;
	
	@SuppressWarnings("static-access")
	Ass35Employee(float salary)
	{
		cnt = ++empNo;
		this.salary = salary;
		count++;
	}
	
	void calTotalSalary()
	{
		totalSalary +=salary;
	}
	
	static void displaySalary()
	{
		System.out.println("Total Salary: "+totalSalary);
	}
	
	static void getCount()
	{
		System.out.println("Total Employee: "+count);
	}
	
	 void displayInfo()
	{
		
		System.out.println("Employee ID : "+cnt);
		System.out.println("Employee Salary : "+salary);
		//System.out.println("Total Salary: "+totalSalary);
	}
	
	public static void main(String args[]) 
	{
		Ass35Employee e = new Ass35Employee(100000);
		e.calTotalSalary();
		//e.displayInfo();
		
		Ass35Employee e1 = new Ass35Employee(200000);
		e1.calTotalSalary();
		//e1.displayInfo();
		
		Ass35Employee e2 = new Ass35Employee(300000);
		e2.calTotalSalary();
		//e2.displayInfo();
		
		Ass35Employee e3 = new Ass35Employee(400000);
		e3.calTotalSalary();
		//e3.displayInfo();
		
		Ass35Employee e4 = new Ass35Employee(500000);
		e4.calTotalSalary();
		//e4.displayInfo();
		
		e.displayInfo();
		e1.displayInfo();
		e2.displayInfo();
		e3.displayInfo();
		e4.displayInfo();
		
		Ass35Employee.getCount();
		Ass35Employee.displaySalary();
	}
}
