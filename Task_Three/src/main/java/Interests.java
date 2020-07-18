import java.util .*;
import java.io.*;

public class Interests{
	public static void main(String args[]) throws IOException
	 {
	    double amount, roi, years, si,ci;
	    Scanner sc=new Scanner (System. in);
	    PrintStream myout=new PrintStream(new FileOutputStream(FileDescriptor.out));
	    myout.println("Enter Amount:");
	    amount=sc.nextDouble();
	    myout.println("Enter the No.of years:");
	    years=sc.nextDouble();
	    myout.println("Enter the Rate of  interest");
	    roi=sc.nextDouble();
	    si=(amount * years * roi)/100;
	    ci=amount * Math.pow(1.0+roi/100.0,years) - amount;
	    myout.println("Simple Interest="+si);
	    myout.println("Compound Interest="+ci);
	    sc.close();
	    myout.close();
	   }


}
