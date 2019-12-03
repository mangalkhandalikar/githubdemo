import java.io.FileOutputStream;
import java.io.IOException;

/*69.	Write a program to count no of words in a 
 * text file and average word size.*/

public class Ass69CountWords 
{
	public static void main(String[] args) throws IOException 
	{	
		FileOutputStream fos = new FileOutputStream("d://xyz.txt");
		
		String s = "Java Programming language Hi good morning";
		byte b[] = s.getBytes();
		fos.write(b);
		System.out.println(b);
		System.out.println("Success");
		
		String wc[] = s.split(" ");
		System.out.println("No of words: "+wc.length);
		
		fos.close();
	}
}
