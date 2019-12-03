/*38. Create class Tile to store the edge length of a square tile , and  
 * create another  class Floor to store length and width of a rectangular floor.  
	Add method totalTiles(Tile t) in Floor class with Tile as argument to 
	calculate the whole number of tiles needed to cover the floor completely.
 */
import java.util.Scanner;

public class Ass38Tile 
{
	int length;
	
	Scanner sc = new Scanner(System.in);
	
	void acceptTile()
	{
		System.out.println("Enter edge length of square tile: ");
		length = sc.nextInt();
	}
	
	public static void main(String[] args) 
	{
		Ass38Tile t = new Ass38Tile();
		Floor f = new Floor();
		t.acceptTile();
		f.acceptFloor();
		f.totalTilea(t);
	}
}

class Floor
{
	int length, width, lcover, wcover;
	Scanner sc = new Scanner(System.in);
	
	void acceptFloor()
	{
		System.out.println("Enter length and width of floor: ");
		length = sc.nextInt();
		width = sc.nextInt();
	}
	
	void totalTilea(Ass38Tile t)
	{
		lcover=length/t.length;
		wcover=width/t.length;
		System.out.println("Total tiles needed to cover the floor completely are "+lcover*wcover);
	}
}