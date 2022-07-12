package variables;

public class Widening {
	
	static int a=23;
	
	int h=33;

	public static void main(String[] args) {
		
		int r=200;
		long b =r;
		System.out.println(b);
		
		int c =10;
		float d =c;
		System.out.println(d);
		
		short e = 12222;
		int f =e;
		System.out.println(f);
		
		System.out.print("H");
		System.out.print("E"+"L");
		System.out.print("L"+"O" + " T");
		System.out.print("H"+ "I"+ "S" + " I"+"S");
		System.out.print(" R" + "A"+ "M");
		System.out.println("   ");
		
		Widening v = new Widening();
		v.add();
		
		
		sub();
		System.out.println(a);
		System.out.println(Widening.a);
	}
	public void add()
	{
		int b=a+200;
		System.out.println(b);
		System.out.println(a);
	}
	
	public static void sub()
	{
		System.out.println(a);
	}
}
