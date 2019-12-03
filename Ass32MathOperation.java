/*32.	Create a class MathOperation containing method ‘multiply’ to calculate multiplication 
 * of following arguments.
		a.	two integers
		b.	three float
		c.	all elements of array
		d.	one double and one integer
 */

import java.util.Scanner;

public class Ass32MathOperation 
{
	int multiply(int a, int b)
	{
		return (a*b);
	}
	
	float multiply(float a, float b, float c)
	{
		return (a*b*c);
	}
	
	int multiply(int arr[])
	{
		int mul=1;
		
		for(int i=0;i<arr.length;i++)
		{
			mul = mul*arr[i];
		}
		return mul;
	}
	
	double multiply(double a, int b)
	{
		return (a*b);
	}
	
	public static void main(String args[])
	{
		Ass32MathOperation mo = new Ass32MathOperation();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two inetgers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Multiplication of "+a+" abd "+b+" is "+mo.multiply(a,b));
		
		System.out.println("Enter float value: ");
		double x = sc.nextDouble();
		System.out.println("Enter integer value: ");
		int y = sc.nextInt();
		System.out.println("Multiplication  of "+x+" and "+y+" is "+mo.multiply(x, y));
		
		System.out.println("Enter three float values: ");
		float p = sc.nextFloat();
		float q = sc.nextFloat();
		float r = sc.nextFloat();
		System.out.println("Multiplication of "+p+", "+q+" and "+r+" is "+mo.multiply(p,q,r));
		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter array values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Multiplication : "+mo.multiply(arr));
	}
}
