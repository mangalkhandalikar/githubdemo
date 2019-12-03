import java.util.Scanner;

/*46.Explain the importance of toString() and equals() method of 
	the Object class and override them on class Employee(empId,name,salary).
a.	Create class for main method(say XYZ),and accept five employees 
	information and store in an array. Also ensure if entered empId 
	already exist or not (use equals method). 
b.	Display all employee info using toString method;
*/

public class Ass46Employee 
{
	public static void main(String[] args) 
	{
		Employee1 e[] = new Employee1[5];
		
		for(int i=0; i<5; i++)
		{
			e[i] = new Employee1();
			e[i].accept();
			
			for(int j=0; j<i; j++)
			{
				if(e[i].equals(e[j]))
				{
					System.out.println("Entered employee id exist");
					System.out.println("Enter another employee id");
					e[i].accept();
				}
			}
		}
		
		for(int i=0; i<5; i++)
		{
			System.out.println(e[i]);
		}
	}
}

class Employee1
{
	int empId;
	String name;
	float salary;
	
	Scanner sc = new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter employee ID: ");
		empId = sc.nextInt();
		
		System.out.println("Enter name: ");
		name = sc.next();
		
		System.out.println("Enter salary: ");
		salary = sc.nextFloat();
	}

	public String toString() 
	{
		return "Employee Details:  [Employee Id=" + empId + ", Name=" + name + ", Salary=" + salary + "]";
	}

	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
}
