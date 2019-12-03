import java.util.Scanner;

public class Ass42Student 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		SchoolStudent ss_array[] = new SchoolStudent[2];
		CollegeStudent sc_array[] = new CollegeStudent[3];
		
		for(int i=0; i<ss_array.length; i++)
		{
			System.out.println("Enter roll number: ");
			int r = sc.nextInt();
			
			System.out.println("Enter percentage: ");
			float p = sc.nextFloat();
			
			System.out.println("Enter class name: ");
			String c = sc.next();
			
			SchoolStudent ssp = new SchoolStudent(c,r,p);
			ss_array[i] = ssp;
		}
		
		for(int i=0; i<sc_array.length; i++)
		{
			System.out.println("Enter roll number: ");
			int r = sc.nextInt();
			
			System.out.println("Enter percentage: ");
			float p = sc.nextFloat();
			
			System.out.println("Enter semester: ");
			int s = sc.nextInt();
			
			CollegeStudent csp = new CollegeStudent(s,r,p);
			sc_array[i] = csp;
		}
		
		//System.out.println("College");
		for(int i=0; i<sc_array.length; i++)
		{
			sc_array[i].show();
		}
		
		//System.out.println("School");
		for(int i=0; i<ss_array.length; i++)
		{
			ss_array[i].show();
		}
		
		Student.search(ss_array, sc_array);
		Student.grade(ss_array, sc_array);
	}
	
}

class Student
{
	int rollno;
	float percentage;
	
	Student()
	{
		rollno = 0;
		percentage = 0.0f;
	}
	
	Student(int r, float p)
	{
		rollno = r;
		percentage = p;
	}
	
	void show()
	{
		System.out.println("Roll no. = "+rollno);
		System.out.println("Percentages = "+percentage);
	}
	
	static void search(SchoolStudent ss[], CollegeStudent cs[])
	{
		System.out.println("Enter roll number to search: ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int flag=0;
		
		for(int i=0; i<ss.length; i++)
		{
			if(r == ss[i].rollno)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("Roll number found in school student");
		}
		else
		{
			System.out.println("Roll number is not present");
		}
		
		flag=0;
		for(int j=0; j<cs.length; j++)
		{
			if(r == cs[j].rollno)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("Roll number found in school student");
		}
		else
		{
			System.out.println("Roll number is not present");
		}
	}
	
	static void grade(SchoolStudent ss[], CollegeStudent cs[])
	{
		//float per=ss[0].percentage;
		int count=0;
		
		for(int i=0; i<ss.length; i++)
		{
			if(ss[i].percentage > 75)
			{
				count++;
			}
		}
		
		for(int i=0; i<cs.length; i++)
		{
			if(cs[i].percentage > 75)
			{
				count++;
			}
		}
		
		System.out.println("Students having A grade are "+count);
	}
}

class CollegeStudent extends Student
{
	int semester;

	CollegeStudent()
	{
		semester = 0;
	}
	
	CollegeStudent(int sem, int r, float p)
	{
		super(r,p);
		semester = sem;
	}
	
	void show()
	{
		System.out.println("============ Collage Student ============");
		super.show();
		System.out.println("Semester = "+semester);
	}
}

class SchoolStudent extends Student
{
	String className;
	
	SchoolStudent()
	{
		className = null;
	}
	
	SchoolStudent(String classnm, int r, float p)
	{
		super(r,p);
		className = classnm;
	}
	
	void show()
	{
		System.out.println("============ School Student ============");
		super.show();
		System.out.println("Class Name = "+className);
	}
}
