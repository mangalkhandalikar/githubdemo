import java.util.Scanner;

/*64. Create a Thread class to print following star(*) pattern on screen 
 with delay of 1 second between each * print. Number of lines in the 
 pattern should be passed to the constructor of Thread class. 
* * * * *
* * * *
* * *
* *
*
Use this class in main method and ask user to enter number of lines to print. 
*/

public class Ass64Pattern
{
	public static void main(String[] args) 
	{
		MyThread t = new MyThread();
		t.start();
	}
}

class MyThread extends Thread
{
	@SuppressWarnings("static-access")
	public void run()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of lines: ");
		int n = sc.nextInt();
		
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				try 
				{
					Thread.currentThread().sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
