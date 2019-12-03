/*37. Make list of Students having name, roll no., age, score. 
 * Write a program to accept 10 students record and arrange the 
 * Students based on the score group [0-50],[50-65],[65-80],[80-100]. */

import java.util.Scanner;

public class Ass37Marks 
{
	String name;
	int rollno, age;
	float score;
	
	public Ass37Marks(String name, int rollno, int age, float score) 
	{
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.score = score;
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll no.: "+rollno);
		System.out.println("Age: "+age);
		System.out.println("Score: "+score);
	}
	
	static void groupData(Ass37Marks m[])
	{
		System.out.println("Student having score group [0-50]");
		for(int i=0; i<10; i++)
		{
			if(m[i].score>=0 && m[i].score<=50)
			{
				m[i].display();
			}
		}
		
		System.out.println("Student having score group [50-65]");
		for(int i=0; i<10; i++)
		{
			if(m[i].score>50 && m[i].score<=65)
			{
				m[i].display();
			}
		}
		
		System.out.println("Student having score group [65-80]");
		for(int i=0; i<10; i++)
		{
			if(m[i].score>65 && m[i].score<=80)
			{
				m[i].display();
			}
		}
		
		System.out.println("Student having score group [80-100]");
		for(int i=0; i<10; i++)
		{
			if(m[i].score>80 && m[i].score<=100)
			{
				m[i].display();
			}
		}
	}

	public static void main(String args[])
	{
		Ass37Marks m[] = new Ass37Marks[10];
		
		String name;
		int rollno, age;
		float score;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Enter name: ");
			name = sc.next();
			
			System.out.println("Enetr roll number: ");
			rollno = sc.nextInt();
			
			System.out.println("Enter age: ");
			age = sc.nextInt();
			
			System.out.println("Enter score: ");
			score = sc.nextFloat();
			
			Ass37Marks m1 = new Ass37Marks(name,rollno,age,score);
			
			m[i]= m1;
		}
		Ass37Marks.groupData(m);
	}
}
