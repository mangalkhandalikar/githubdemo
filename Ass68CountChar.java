import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*68.Write a program to count how many times character ‘t’ occurs in a file.*/

public class Ass68CountChar 
{
	public static void main(String[] args) throws IOException 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fos = new FileOutputStream("d://xyz.txt");
		
		String s = "Java Programming";
		byte b[] = s.getBytes();
		fos.write(b);
		
		System.out.println("Success");
		
		@SuppressWarnings("resource")
		FileInputStream fis = new FileInputStream("d://xyz.txt");
		System.out.println("Enter character to count: ");
		char ch = sc.next().charAt(0);
		
		int i=0, count=0;
		
		while((i=fis.read()) != -1)
		{
			if((char)i == ch)
			{
				count++;
			}
		}
		
		System.out.println(count+" times '"+ch+"' occurs");
		fos.close();
	}
}
