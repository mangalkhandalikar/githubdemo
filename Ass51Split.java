/*
51. Input data exactly in the following format, and print sum of all 
integer values. “67, 89, 23, 67, 12, 55, 66”. (Hint use String class split 
method and Integer class parseInt method)
*/

public class Ass51Split 
{
	public static void main(String[] args) 
	{
		String num= "67,89,23,67,12,55,66";
		int sum =0;
		
		String array1[]=num.split(",");
		
		for(int i=0; i<array1.length; i++)
		{
			//System.out.print(array1[i]+"\t");
			sum = sum+Integer.parseInt(array1[i]);
		}
		
		System.out.println("Sum : "+sum);
	}
}
