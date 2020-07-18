
import java.util.Scanner;
import java.io.*;
abstract class CalculateCost
{
	abstract void show(String material,int area);
}
class Material extends CalculateCost
{int total;
 PrintStream ps =new PrintStream(new FileOutputStream(FileDescriptor.out));
	void show(String material,int area)
	{
		if(material.equals("Standard") )
		{
			total=area * 1200;
			ps.println("The cost required to build a house"+total);
		}
		if(material.equals(" Above Standard") )
		{
			total=area * 1500;
			ps.println("The cost required to build a house"+total);
		}
		if(material.equals(" High Standard") )
		{
			total=area * 1800;
			ps.println("The cost required to build a house"+total);
		}
		if(material.equals("High Standard and Fully Automated") )
		{
			total=area * 2500;
			ps.println("The cost required to build a house"+total);
		}
		
	}
	
}
public class Cost {

	public static void main(String args[]) throws IOException{
		String typeOfMaterial;
		int areaOfHouse;
		Scanner sc=new Scanner(System. in);
		PrintStream ps=new PrintStream(new FileOutputStream(FileDescriptor.out));
		ps.println(" Enter the type of material");
		typeOfMaterial=sc.nextLine();
		ps.println(" Enter the area");
		areaOfHouse=sc.nextInt();
		Material m = new Material();
		m.show(typeOfMaterial, areaOfHouse);
		sc.close();
		ps.close();
	}

}




