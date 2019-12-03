import java.util.Scanner;

/*45. Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. 
 * 	create abstract method calcTax().
a.	Create class Employee(empId,name,salary) and implement Taxable to 
	calculate incomeTax on yearly salary.
b.	Create class Product(pid,price,quantity) and implement Taxable to 
	calculate salesTax on unit price of product.
c.	Create class for main method(Say XYZ), accept employee information 
	and a product information from user and print income tax and 
	sales tax respectively.
*/

public class Ass45Taxable 
{
	public static void main(String[] args) 
	{
		Taxable e = new Employee();
		e.accept();
		float etax = e.calcTax();
		System.out.println("Income tax : "+etax);
		
		Taxable p = new Product();
		p.accept();
		float ptax = p.calcTax();
		System.out.println("Sales tax : "+ptax);
	}
}

interface Taxable
{
	float salesTax=7, incomeTax=10.5f;
	abstract float calcTax();
	abstract void accept();
}

class Employee implements Taxable
{
	int empId;
	String name;
	float salary;
	
	Scanner sc = new Scanner(System.in);
	
	public float calcTax() 
	{
		return salary*incomeTax/100;
	}
	
	public void accept()
	{
		System.out.println("Enter employee ID: ");
		empId = sc.nextInt();
		
		System.out.println("Enter name: ");
		name = sc.next();
		
		System.out.println("Enter salary: ");
		salary = sc.nextFloat();
	}
}

class Product implements Taxable
{
	int pid;
	float price;
	int quantity;
	
	Scanner sc = new Scanner(System.in);
	
	public float calcTax() 
	{
		return price*salesTax/100;
	}
	
	public void accept()
	{
		System.out.println("Enter product ID: ");
		pid = sc.nextInt();
		
		System.out.println("Enter price: ");
		price = sc.nextFloat();
		
		System.out.println("Enter quantity: ");
		quantity = sc.nextInt();
	}
}