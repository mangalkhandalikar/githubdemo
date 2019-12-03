/*40. Create class OneBHK with instance variable roomArea , hallArea and price
		a.	Create default and parameterized constructor;
		b.	Method show(): to print OneBHK data member information;
	Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
		a.	Create default and parameterized constructor;
		b.	Method show(): to print all data member information;
	Write main function in another class(Say XYZ) and store three TwoBHK flat’s information  and print  information using show method. 
	Also print total amount of all flats.
*/

import java.util.Scanner;

class OneBHK
{
	int roomArea, hallArea, price;
	
	OneBHK()
	{
		roomArea = 200;
		hallArea = 500;
		price = 5000000;
	}

	public OneBHK(int roomArea, int hallArea, int price) 
	{
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}
	
	void show()
	{
		System.out.println("Room1 area = "+roomArea);
		System.out.println("Hall area = "+hallArea);
		System.out.println("Price  = "+price);
	}
}

class TwoBHK extends OneBHK
{
	int room2Area;
	
	TwoBHK()
	{
		room2Area = 300;
	}

	public TwoBHK(int room2Area, int roomArea, int hallArea, int price) 
	{
		super(roomArea, hallArea, price);
		this.room2Area = room2Area;
	}
	
	void show()
	{
		System.out.println("-----------------------------");
		super.show();
		System.out.println("Room2 area = "+room2Area);
	}
	
	void totalPrice(TwoBHK t[])
	{
		int total = 0;
		for(int i=0; i<3; i++)
		{
			total = total + t[i].price;
		}
		System.out.println("Total price of flats = "+total);
	}
}

public class Ass40Flat 
{	
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		TwoBHK tf[] = new TwoBHK[3];
		
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter area of 1st room: ");
			int rm1 = sc.nextInt();
			
			System.out.println("Enter area of 2st room: ");
			int rm2 = sc.nextInt();
			
			System.out.println("Enter area of hall: ");
			int hl = sc.nextInt();
			
			System.out.println("Enter price: ");
			int p = sc.nextInt();
			
			TwoBHK t = new TwoBHK(rm2, rm1, hl, p);
			
			tf[i] = t;
		}
		
		for(int i=0; i<3; i++)
		{
			tf[i].show();
		}
		
		tf[0].totalPrice(tf);
	}
}
