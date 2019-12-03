/*36. Create class Product (pid, price, quantity) with parameterized constructor.
	Create a main function in different class (say XYZ) and perform following task:
		a.	Accept five product information from user and store in an array
		b.	Find Pid of product with highest price.
		c.	Create method (with array of product’s object as argument) in XYZ class to 
		calculate and return total amount spent on all products.
		(amount spent on single product=price of product * quantity of product)
*/

import java.util.Scanner;

public class Ass36Product 
{
	public static void main(String args[])
	{
		ProductMain p[] = new ProductMain[5];
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<p.length; i++)
		{
			System.out.println("Enter product id:");
			int id = sc.nextInt();
			
			System.out.println("Enter product price");
			float pr = sc.nextFloat();
			
			System.out.println("Enter quantity: ");
			int q = sc.nextInt();
			
			p[i] = new ProductMain(id,pr,q);
		}
		
		ProductMain.highestPrice(p);
		System.out.println("Total amount spend is: "+ProductMain.totalAmount(p));
	}
}

class ProductMain
{	
	int pid, quantity;
	float price;
	
	ProductMain(int pid, float price, int quantity)
	{
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	static void highestPrice(ProductMain[] p)
	{
		float highPr = p[0].price;
		int highId=0;
		
		for(int i=0; i<p.length; i++)
		{
			if(p[i].price > highPr)
			{
				highPr = p[i].price;
				highId = p[i].pid;
			}
		}
		
		System.out.println("Product id "+highId+" has highest Price: "+highPr);
	}
	
	static float totalAmount(ProductMain[] p)
	{
		float total=0;
		
		for(int i=0; i<p.length; i++)
		{
			float onePr = p[i].price*p[i].quantity;
			total = total+onePr; 
		}
		return total;
	}
}
