package variables;

public class Narrowing2{

	public static void main (String [] args )
	{
		int a = 350;
		double d = 233.987;
		byte b = (byte)a;
		byte c = (byte)d;
		System.out.println(" Conversion of int to byte, int a - "+a+" to byte b "+b);
		System.out.println(" Conversion of double to byte, double d - "+d+" to byte c "+c);
	}
}

